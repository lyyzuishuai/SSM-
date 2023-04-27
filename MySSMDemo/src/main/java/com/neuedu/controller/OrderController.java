package com.neuedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manage/order/")
public class OrderController {
    @RequestMapping("/list")
    public String toList(){
        return "/order/list";
    }
}
