package com.neuedu.controller.manage;

import com.alibaba.fastjson.JSONObject;
import com.neuedu.entity.EasybuyUser;
import com.neuedu.entity.Page;
import com.neuedu.service.EasyBuyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * 管理员请求都写着此控制器中
 */
@Controller
@RequestMapping("/manage")
public class AdminController {

    @Autowired
    private EasyBuyUserService userService;

    /**
     * 访问登录页面
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String tologin() {
        return "login";
    }

    /**
     * 处理登录请求
     *
     * @param uname
     * @param pwd
     * @param session
     * @return
     */
    @RequestMapping(value = "/loginUser", method = RequestMethod.POST)
    public ModelAndView login(@RequestParam("uname") String uname,
                              @RequestParam("upwd") String pwd,
                              HttpSession session) {
        ModelAndView mv = new ModelAndView();
        //1、取 //2、调
        EasybuyUser user = userService.selectByAdmin(uname, pwd);
        //3、转
        if (user != null) {
            session.setAttribute("admin", user);
            mv.setViewName("redirect:/manage/user/list");
        } else {
            System.out.println("登录失败");
            mv.setViewName("login");
        }
        return mv;
    }


    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/manage/login";
    }

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public ModelAndView getUserList(@RequestParam(name = "pageNo", defaultValue = "1") int pageNo,
                                    @RequestParam(name = "pageSize", defaultValue = "5") int pageSize,
                                    @RequestParam(name = "key", required = false) String key) {

        Page<EasybuyUser> page = new Page<EasybuyUser>(pageNo, pageSize);
        if (key != null && !"".equals(key)) {
            page.setKey(key);
        }
        List<EasybuyUser> users = userService.selectByPage(page);
        ModelAndView mv = new ModelAndView();
        mv.addObject("users", users);
        mv.addObject("page", page);
        mv.setViewName("/user/list");
        return mv;
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public ModelAndView getUserAdd(@RequestParam(name = "pageNo", defaultValue = "1") int pageNo,
                                   @RequestParam(name = "pageSize", defaultValue = "5") int pageSize,
                                   @RequestParam(name = "key", required = false) String key) {

        Page<EasybuyUser> page = new Page<EasybuyUser>(pageNo, pageSize);
        if (key != null && "".equals(key)) {
            page.setKey(key);
        }
        List<EasybuyUser> users = userService.selectByPage(page);
        ModelAndView mv = new ModelAndView();
        mv.addObject("users", users);
        mv.addObject("page", page);
        mv.setViewName("/user/add");
        return mv;
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    public void save(@RequestParam("loginName") String loginName,
                     @RequestParam("userName") String userName,
                     @RequestParam("email") String email,
                     @RequestParam("mobile") String mobile,
                     @RequestParam("type") Integer type,
                     HttpServletResponse response) throws IOException {
        //1、取
        EasybuyUser easybuyUser = new EasybuyUser();
        easybuyUser.setLoginname(loginName);
        easybuyUser.setUsername(userName);
        easybuyUser.setEmail(email);
        easybuyUser.setMobile(mobile);
        easybuyUser.setType(type);

        //2、调用
        int rs = userService.save(easybuyUser);
        //防止界面乱码
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        if (rs == 1) {
            response.getWriter().print("<script>alert('添加成功！');window.location='/manage/user/list'</script>");
        } else
            response.getWriter().print("<script>alert('添加失败！');window.location='/manage/user/add'</script>");
    }


//    @RequestMapping("selectUserAll")
//    public List<EasybuyUser> selectUserAll (){
//         userService.selectUserAll();
//    }
}
