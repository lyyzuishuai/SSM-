package com.neuedu.controller.manage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manage")
public class HomeController {

    @RequestMapping("/home")
    public String toHome() {
        return "home";
    }
}
