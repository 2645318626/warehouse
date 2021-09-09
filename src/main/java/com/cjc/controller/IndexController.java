package com.cjc.controller;

import com.cjc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Author: CJC
 * @Date： 2021-07-19 23:23
 */
@Controller
public class IndexController {

    /**
     * 到登陆页
     */
    @GetMapping(value = {"/", "/login"})
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {
        if (!StringUtils.isEmpty(user.getUsername()) && "123456".equals(user.getPassword())) {
            session.setAttribute("loginUser", user);
            //登陆成功，重定向到main页面; 重定向防止表单重复提交
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "账号密码错误！");
            //回到登录页
            return "login";
        }
    }

    /**
     * 去main页面
     */
    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model) {
        //是否登录：  拦截器，过滤器
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser != null) {
            return "main";
        } else {
            model.addAttribute("msg", "无权限，请登录！");
            //回到登录页
            return "login";
        }
    }
}
