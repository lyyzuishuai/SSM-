package com.neuedu.controller;


import com.alibaba.fastjson.JSONObject;
import com.neuedu.entity.EasybuyUser;
import com.neuedu.service.EasyBuyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 控制器类
 * 视图层调用业务逻辑层
 * 1、在类上添加@Controller注解
 * 2、添加业务逻辑层接口引用,再加上自动注入注解
 * 3、写具体方法（取调转），配上路由
 */
@Controller
public class UserController {

    //声明业务逻辑层接口对象
    @Autowired
    private EasyBuyUserService userService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public @ResponseBody String getUser(@PathVariable("id") Integer id) {
        //1、取 2、调  3、转
        //1、取  方法的参数
        //2、调
        EasybuyUser user = userService.getUser(id);
        //3、转
        return JSONObject.toJSONString(user);
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public String tologin() {
        return "/user/login";
    }


    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String login(@RequestParam("uname") String uname,
                        @RequestParam("upwd") String pwd,
                        HttpSession session) {
        //1、取 //2、调
        EasybuyUser user = userService.selectByUser(uname, pwd);
        //3、转
        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/";
        } else {
            return "redirect:/user/login";
        }
    }

    /**
     * 根据id删除用户信息
     *
     * @param id
     * @return
     */
    @RequestMapping("/user/deleteUserById")
    @ResponseBody
    public Map deleteUserById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        Integer row = userService.deleteUserById(id);
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
    @RequestMapping("/user/returnUserEditPage")
    public ModelAndView returnUserEditPage(Integer id) {
        ModelAndView mv = new ModelAndView();
        EasybuyUser user = userService.getUser(id);
        mv.addObject("user", user);
        mv.setViewName("/user/edit-user");
        return mv;
    }


    @RequestMapping("/user/updateUserById")
    public void updateUserById(EasybuyUser user, HttpServletResponse response) throws IOException {
        Integer rs = userService.updateUserById(user);

        //防止界面乱码
        response.setHeader("Content-type", "text/html;charset=UTF-8");

        if (rs == 1) {
            response.getWriter().print("<script>alert('修改成功！');window.location='/manage/user/list'</script>");
        } else
            response.getWriter().print("<script>alert('修改失败！');window.location='/manage/user/add'</script>");
    }
}
