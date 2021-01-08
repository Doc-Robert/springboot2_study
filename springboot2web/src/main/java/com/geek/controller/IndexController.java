package com.geek.controller;

import com.geek.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;


/**
 * @Author Robert
 * @create 2020/12/25 9:18
 * @Version 1.0
 */

@Controller
public class IndexController {

    /**
     * login 页面
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }


    @GetMapping("/main")
    public String mainPage(HttpSession session, Model model){
//        Object loginUser = session.getAttribute("loginUser");
//        if (loginUser !=null){
//            return "main";
//        }else {
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }
        return "main";
    }


    @PostMapping("/login")
    public String login(User user, HttpSession httpSession, Model model){
        if (StringUtils.hasLength(user.getUserName())&&StringUtils.hasLength(user.getPassword())){
            httpSession.setAttribute("loginUser",user);
            return "redirect:main";
        }else {
            model.addAttribute("msg","account password error");
            return "login";
        }
    }
}
