package com.neuedu.controller.manage;

import com.alibaba.fastjson.JSONObject;
import com.neuedu.entity.EasybuyCategory;
import com.neuedu.entity.EasybuyProduct;
import com.neuedu.entity.EasybuyUser;
import com.neuedu.entity.Page;
import com.neuedu.service.EasyBuyProductService;
import com.neuedu.service.EasybuyCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/manage/prod")
public class ProductController {

    @Autowired
    private EasyBuyProductService productService;
    @Autowired
    private EasybuyCategoryService categoryService;

    @RequestMapping("/list")
    public ModelAndView getList(@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                                @RequestParam(name = "pageSize", defaultValue = "5") Integer pageSize,
                                @RequestParam(name = "key", required = false) String key) {
        //1、取
        //2、调
        Page<EasybuyProduct> page = new Page<EasybuyProduct>(pageNo, pageSize);
        if (key != null && !"".equals(key)) {
            page.setKey(key);
        }
        page.setOrderField("id");
        page.setOrderDirection("desc");
        ArrayList<EasybuyProduct> products = productService.selectByPage(page);
        //3、
        ModelAndView mv = new ModelAndView();
        mv.addObject("prods", products);
        mv.addObject("page", page);
        mv.setViewName("/prod/list");
        return mv;
    }

    @RequestMapping("/add")
    public ModelAndView toAdd() {
        //2、调用
        ArrayList<EasybuyCategory> categories = categoryService.selectByAll();

        List<EasybuyCategory> level1 = categories.stream().filter(c -> c.getType() == 1).collect(Collectors.toList());
        List<EasybuyCategory> level2 = categories.stream().filter(c -> c.getType() == 2).collect(Collectors.toList());
        List<EasybuyCategory> level3 = categories.stream().filter(c -> c.getType() == 3).collect(Collectors.toList());
        //3、
        ModelAndView mv = new ModelAndView();
        mv.addObject("level1", JSONObject.toJSONString(level1));
        mv.addObject("level2", JSONObject.toJSONString(level2));
        mv.addObject("level3", JSONObject.toJSONString(level3));
        mv.setViewName("/prod/add");
        return mv;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(@RequestParam("pname") String name,
                     @RequestParam("description") String description,
                     @RequestParam("price") Float price,
                     @RequestParam("stock") Integer stock,
                     @RequestParam("level1") Integer level1,
                     @RequestParam("level2") Integer level2,
                     @RequestParam("level3") Integer level3,
                     @RequestParam("picUrl") String picUrl,
                     HttpServletResponse response) throws IOException {
        //1、取
        EasybuyProduct easybuyProduct = new EasybuyProduct(name, description, price, stock, level1, level2, level3, picUrl);
        //2、调用
        int rs = productService.save(easybuyProduct);
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        if (rs == 1) {
            response.getWriter().print("<script>alert('添加成功！');window.location='/manage/prod/list'</script>");
        } else
            response.getWriter().print("<script>alert('添加失败！');window.location='/manage/prod/add'</script>");
    }

    @RequestMapping("/prod/deleteProductById")
    @ResponseBody
    public Map deleteProductById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        Integer row = productService.deleteProductById(id);
        if (row == 1) {
            map.put("msg", "ok");
        } else {
            map.put("msg", "no");
        }
        return map;
    }

    /**
     * 返回用户编辑界面
     */
    @RequestMapping("/prod/returnProductEditPage")
    public ModelAndView returnProductEditPage(Integer id) {
        ModelAndView mv = new ModelAndView();
        EasybuyProduct prod = productService.getProduct(id);
        mv.addObject("prod", prod);
        mv.setViewName("/prod/edit-prod");
        return mv;
    }

    @RequestMapping("/updateProductById")
    public void updateUserById(EasybuyProduct product, HttpServletResponse response) throws IOException {
        Integer rs = productService.updateProductById(product);

        //防止界面乱码
        response.setHeader("Content-type", "text/html;charset=UTF-8");

        if (rs == 1) {
            response.getWriter().print("<script>alert('修改成功！');window.location='/manage/prod/list'</script>");
        } else
            response.getWriter().print("<script>alert('修改失败！');window.location='/manage/prod/list'</script>");
    }
}
