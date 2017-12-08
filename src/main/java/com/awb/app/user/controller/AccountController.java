package com.awb.app.user.controller;

import com.awb.app.user.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class AccountController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    /*@RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){
        return "home";
    }*/

    /*@RequestMapping(value = "/403",method = RequestMethod.POST)
    public String unauthor(){
        return "403";
    }*/


    @RequestMapping(value = "/loginUser",method = RequestMethod.POST)
    public String loginUser(@RequestParam(value = "username") String username,@RequestParam(value = "password") String password, HttpSession session) {
//        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(username,password);
//        Subject subject = SecurityUtils.getSubject();
//        try {
//            subject.login(usernamePasswordToken);   //完成登录
//            User user=(User) subject.getPrincipal();
//            session.setAttribute("user", user);
//            return "redirect:/home";
////            ModelAndView mav=new ModelAndView();
////            mav.setViewName("error");
////            return mav;
////            return "home";
//        } catch(Exception e) {
////            ModelAndView mav=new ModelAndView();
////            mav.setViewName("login");
////            return mav;
////            return "login";//返回登录页面
//            return "redirect:/login";
//        }
//
        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(username,password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(usernamePasswordToken);   //完成登录
            User user=(User) subject.getPrincipal();
            session.setAttribute("user", user);
            return "home";
        } catch(Exception e) {
            return "login";//返回登录页面
        }

    }
    @RequestMapping("/logOut")
    public String logOut(HttpSession session) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
//        session.removeAttribute("user");
        return "login";
    }


}
