package com.neuedu.controller;

import com.neuedu.entity.*;
import com.neuedu.service.EasyBuyProductService;
import com.neuedu.service.EasybuyGwcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 购物车控制器
 */
@Controller
@RequestMapping("/shoppingCart")
public class EbShoppingCartController {

    @Autowired
    private EasyBuyProductService productService;

    @Autowired
    private EasybuyGwcService easybuyGwcService;

    @RequestMapping("/add")
    public String addSItem(@RequestParam("pid") Integer pid,
                           @RequestParam Integer num, HttpSession session) {
        //判断用户是否登录，
        EasybuyUser user = (EasybuyUser) session.getAttribute("user");
        if (user != null) {
            //根据id取商品信息
            EasybuyProduct product = productService.selectById(pid);

            //如果购物车存在该商品则+1
            EasybuyGwc easybuyGwcs =easybuyGwcService.selectGwcByProdcutId(pid);
            if(easybuyGwcs!=null){
                easybuyGwcService.updateProductNumByProductId(pid);
            }else {
                //商品存在
                if (product != null) {
                    //从session中取登录信息
                    EasybuyGwc easybuyGwc = new EasybuyGwc();
                    easybuyGwc.setUser_id(user.getId());
                    easybuyGwc.setNum(num);
                    easybuyGwc.setProduct_price(product.getPrice());
                    easybuyGwc.setProduct_img(product.getFilename());
                    easybuyGwc.setProduct_name(product.getName());
                    easybuyGwc.setProduct_id(product.getId());

                   easybuyGwcService.save(easybuyGwc);
                    //判断session中是否有购物车对象
//                ShoppingCart shoppingCart = null;
//                if (session.getAttribute("shoppingCart") == null) {
//                    //实例化购物车对象
//                    shoppingCart = new ShoppingCart(user);
//                } else {
//                    //取session中的购物车对象
//                    shoppingCart = (ShoppingCart) session.getAttribute("shoppingCart");
//                }
//                //将商品和数量放入购物车中
//                shoppingCart.addItem(product, num);
//                //将购物车对象放入到session中
//                session.setAttribute("shoppingCart", shoppingCart);
                }
            }
            //跳转购物车界面
            return "redirect:/shoppingCart/list";
        } else {
            //用户未登录，跳转去登录页
            return "redirect:/user/login";
        }
    }

    @RequestMapping("/reduce")
    public String reduceItem(@RequestParam("pid") Integer pid,
                             @RequestParam Integer num, HttpSession session) {
        if (session.getAttribute("user") != null) {
            EasybuyProduct product = productService.selectById(pid);
            if (product != null) {
                EasybuyUser user = (EasybuyUser) session.getAttribute("user");

                ShoppingCart shoppingCart = null;
                if (session.getAttribute("shoppingCart") != null) {
                    shoppingCart = (ShoppingCart) session.getAttribute("shoppingCart");
                }
                shoppingCart.reduceItem(product, num);
                session.setAttribute("shoppingCart", shoppingCart);
            }

            return "redirect:/shoppingCart/list";
        } else {
            return "redirect:/user/login";
        }
    }

    @RequestMapping("/list")
    public ModelAndView showShoppingCart(HttpSession session) {
        EasybuyUser user = (EasybuyUser) session.getAttribute("user");
        ModelAndView mv = new ModelAndView();

        //根据用户id查询购物车信息
        List<EasybuyGwc> easybuyGwcList =easybuyGwcService.selectGwcByUserId(user.getId());
        mv.addObject("easybuyGwcList",easybuyGwcList);
        mv.setViewName("/shoppingCart/list");
        return mv;
    }

    /**
     * 根据id删除购物车信息
     * @param id
     * @return
     */
    @RequestMapping("/deleteShoppingCartById")
    @ResponseBody
    public Map deleteShoppingCartById (Integer id) {
        Map<String,Object> map = new HashMap<>();
        Integer row=easybuyGwcService.deleteShoppingCartById(id);
        if(row>0){
            map.put("msg","ok");
        }else {
            map.put("msg","no");
        }
        return map;
    }

    @RequestMapping("/reduceByProductId")
    public ModelAndView reduceByProductId (@RequestParam("pid") Integer pid,
                                           @RequestParam Integer num,HttpSession session) {
        ModelAndView mv = new ModelAndView();
        EasybuyUser user = (EasybuyUser) session.getAttribute("user");
        boolean isFlag = true;
        if (user !=null){
            List<EasybuyGwc> easybuyGwcList = easybuyGwcService.selectGwcByUserId(user.getId());
            if (!easybuyGwcList.isEmpty()){
                for (EasybuyGwc easybuyGwc : easybuyGwcList) {
                    if (easybuyGwc.getNum()<=1 && pid.equals(easybuyGwc.getProduct_id())){
                        isFlag = false;
                    }

                }

            }
            if (isFlag){
                easybuyGwcService.reduceByProductId(pid);
            }else {
                mv.addObject("msg","商品数量已经为1，不能再减！");
            }
        }
        mv.setViewName("redirect:/shoppingCart/list");
        return mv;
    }
}
