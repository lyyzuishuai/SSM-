package com.neuedu.controller.manage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manage/news/")
public class NewsController {

    @RequestMapping("/list")
    public String toList() {
        return "/news/list";
    }
}
