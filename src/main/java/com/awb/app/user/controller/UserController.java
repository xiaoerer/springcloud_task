package com.awb.app.user.controller;

import com.awb.app.user.entity.User;
import com.awb.app.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String user(){

        User user=userService.selectUserByUsername("xiaoer");
        System.out.println(user.getPassword());
        return user.getPassword();
    }

}
