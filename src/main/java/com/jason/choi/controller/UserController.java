package com.jason.choi.controller;

import com.jason.choi.model.User;
import com.jason.choi.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * Created by choi on 2017/8/1.
 */
@Controller
public class UserController {

    @Autowired
    private UserSerivce userService;

    @RequestMapping(value = "/userinfo", method = RequestMethod.GET)
    @ResponseBody
    public User getUserInfo(){

        User user = userService.getUserInfo();
        return user;
    }

}
