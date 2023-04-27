package com.neuedu.controller;

import com.neuedu.entity.EasybuyProduct;
import com.neuedu.service.EasyBuyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EbProductController {

    @Autowired
    private EasyBuyProductService productService;

    @RequestMapping("/prod/{id}")
    public ModelAndView getProd(@PathVariable("id") Integer id) {
        EasybuyProduct product = productService.selectById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("prod", product);
        mv.setViewName("");
        return mv;
    }
}
