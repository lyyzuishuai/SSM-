//package com.neuedu.controller;
//
//
//import com.alibaba.fastjson.JSONObject;
//import com.neuedu.entity.EasybuyUser;
//import com.neuedu.service.EasyBuyUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpSession;
//
///**
// * 控制器类
// * 视图层调用业务逻辑层
// * 1、在类上添加@Controller注解
// * 2、添加业务逻辑层接口引用,再加上自动注入注解
// * 3、写具体方法（取调转），配上路由
// */
//@Controller
//public class EbUserController {
//
//    //声明业务逻辑层接口对象
//    @Autowired
//    private EasyBuyUserService userService;
//
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
//    public @ResponseBody String getUser(@PathVariable("id") Integer id) {
//        //1、取 2、调  3、转
//        //1、取  方法的参数
//        //2、调
//        EasybuyUser user = userService.getUser(id);
//        //3、转
//        return JSONObject.toJSONString(user);
//    }
//
//    /**
//     * 访问登录页面
//     *
//     * @return
//     */
//    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
//    public String tologin() {
//        return "/user/login";
//    }
//
//    /**
//     * 处理登录请求
//     *
//     * @param uname
//     * @param pwd
//     * @param session
//     * @return
//     */
//    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
//    public String login(@RequestParam("uname") String uname,
//                        @RequestParam("upwd") String pwd,
//                        HttpSession session) {
//        //1、取 //2、调
//        EasybuyUser user = userService.selectByUser(uname, pwd);
//        //3、转
//        if (user != null) {
//            session.setAttribute("user", user);
//            return "redirect:/index.html";
//        } else {
//            return "redirect:/user/login";
//        }
//    }
//}
