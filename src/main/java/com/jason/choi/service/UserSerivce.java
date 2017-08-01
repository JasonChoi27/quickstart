package com.jason.choi.service;

import com.jason.choi.mapper.UserMapping;
import com.jason.choi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * Created by choi on 2017/8/1.
 */
@Service
public class UserSerivce {

    @Autowired
    private UserMapping userMapping;

    public User getUserInfo(){

        User user = userMapping.findUserInfo();
        return user;
    }

}
