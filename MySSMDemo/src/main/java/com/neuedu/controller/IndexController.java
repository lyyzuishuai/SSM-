package com.neuedu.controller;

import com.alibaba.fastjson.JSONObject;
import com.neuedu.entity.*;
//import com.neuedu.service.EasyBuyNewsService;
import com.neuedu.service.EasyBuyProductService;
import com.neuedu.service.EasybuyCategoryService;
import com.neuedu.vo.EasybuyProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * 首页控制器
 */
@Controller
public class IndexController {
    @Autowired
    private EasyBuyProductService productService;
    @Autowired
    private EasybuyCategoryService categoryService;

//    @Autowired
//    private EasyBuyNewsService newsService;


    @RequestMapping("/")
    public ModelAndView goIndex(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        Page<EasybuyProduct> page = new Page<>(1, 20);
        page.setOrderField("id");
        page.setOrderDirection("desc");

        EasybuyProductVo easybuyProductVo = new EasybuyProductVo();

        List<EasybuyProduct> easybuyProductList = new ArrayList<>();

        ArrayList<EasybuyCategory> easybuyProducts = categoryService.selectByAll();

        ArrayList<EasybuyProduct> products = productService.selectByPage(page);
        String key = request.getParameter("searchKey");
        String keyValue = request.getParameter("searchKeyValue");
        Integer ketInt = null;
        if (key != null && !"".equals(key)) {
            ketInt = Integer.parseInt(key);
        }

        if (ketInt != null && !"".equals(ketInt) && keyValue != null && !"".equals(keyValue)) {
            Integer finalKetInt = ketInt;
            products.forEach(p -> {
                System.out.println("p:" + p);
                EasybuyProduct easybuyProduct = new EasybuyProduct();
                if (keyValue.equals(p.getName())) {
                    easybuyProduct.setId(p.getId());
                    easybuyProduct.setFilename(p.getFilename());
                    easybuyProduct.setName(p.getName());
                    easybuyProduct.setPrice(p.getPrice());
                    easybuyProductList.add(easybuyProduct);
                }
            });
            easybuyProductVo.setEasybuyProductList(easybuyProductList);
        } else {
            easybuyProductVo.setEasybuyProductList(products);
        }

        easybuyProductVo.setEasybuyCategorList(easybuyProducts);
        mv.setViewName("index");

        List<EasybuyCategory> level1 = easybuyProducts.stream().filter(c -> c.getType() == 1).collect(Collectors.toList());
        List<EasybuyCategory> level2 = easybuyProducts.stream().filter(c -> c.getType() == 2).collect(Collectors.toList());
        List<EasybuyCategory> level3 = easybuyProducts.stream().filter(c -> c.getType() == 3).collect(Collectors.toList());

        HashMap<String, List<EasybuyCategory>> map = new HashMap<>();
        map.put("level1", level1);
        map.put("level2", level2);
        map.put("level3", level3);

        mv.addObject("level", map);
        mv.addObject("easybuyProductVo", easybuyProductVo);

        return mv;
    }


    //首页商品信息
    @RequestMapping("/prod")
    public @ResponseBody String getProds(HttpServletRequest request) {
        Page<EasybuyProduct> page = new Page<>(1, 20);
        page.setOrderField("id");
        page.setOrderDirection("desc");
        //查询所有分类商品名字
        EasybuyProductVo easybuyProductVo = new EasybuyProductVo();


        List<EasybuyProduct> easybuyProductList = new ArrayList<>();


        ArrayList<EasybuyCategory> easybuyProducts = categoryService.selectByAll();

        ArrayList<EasybuyProduct> products = productService.selectByPage(page);
        String key = request.getParameter("searchKey");
        String keyValue = request.getParameter("searchKeyValue");
        Integer ketInt = null;
        if (key != null && !"".equals(key)) {
            ketInt = Integer.parseInt(key);
        }
        if (ketInt != null && !"".equals(ketInt) && keyValue != null && !"".equals(keyValue)) {
            Integer finalKetInt = ketInt;
            products.forEach(p -> {
                System.out.println("p:" + p);
                EasybuyProduct easybuyProduct = new EasybuyProduct();
                if (finalKetInt.equals(p.getCategorylevel1id())) {
                    System.out.println("进来了");
                    if (keyValue.equals(p.getName())) {
                        System.out.println("我进来了");
                        easybuyProduct.setId(p.getId());
                        easybuyProduct.setFilename(p.getFilename());
                        easybuyProduct.setName(p.getName());
                        easybuyProductList.add(easybuyProduct);
                        System.out.println("66666666");
                        System.out.println(easybuyProduct);
                    }
                } else if (finalKetInt.equals(p.getCategorylevel2id())) {
                    if (keyValue.equals(p.getName())) {
                        easybuyProduct.setId(p.getId());
                        easybuyProduct.setFilename(p.getFilename());
                        easybuyProduct.setName(p.getName());
                        easybuyProductList.add(easybuyProduct);
                    }
                } else if (finalKetInt.equals(p.getCategorylevel3id())) {
                    if (keyValue.equals(p.getName())) {
                        easybuyProduct.setId(p.getId());
                        easybuyProduct.setFilename(p.getFilename());
                        easybuyProduct.setName(p.getName());
                        easybuyProductList.add(easybuyProduct);
                    }
                }
            });
            easybuyProductVo.setEasybuyProductList(easybuyProductList);
        } else {
            easybuyProductVo.setEasybuyProductList(products);
        }

        easybuyProductVo.setEasybuyCategorList(easybuyProducts);

        return JSONObject.toJSONString(easybuyProductVo);
    }

//    @RequestMapping("/news")
//    public @ResponseBody String getNews() {
//        Page<EasybuyNews> page = new Page<>(1, 5);
//        page.setOrderField("id");
//        page.setOrderDirection("desc");
//        ArrayList<EasybuyNews> news = newsService.selectByPage(page);
//        return JSONObject.toJSONString(news);
//    }

    @RequestMapping("/categorys")
    public @ResponseBody String getCategorys() {
        ArrayList<EasybuyCategory> categories = categoryService.selectByAll();
        List<EasybuyCategory> level1 = categories.stream().filter(c -> c.getType() == 1).collect(Collectors.toList());
        List<EasybuyCategory> level2 = categories.stream().filter(c -> c.getType() == 2).collect(Collectors.toList());
        List<EasybuyCategory> level3 = categories.stream().filter(c -> c.getType() == 3).collect(Collectors.toList());

        HashMap<String, List<EasybuyCategory>> map = new HashMap<>();
        map.put("level1", level1);
        map.put("level2", level2);
        map.put("level3", level3);
        return JSONObject.toJSONString(map);
    }
}
