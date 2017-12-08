package com.awb.app.user.service.impl;

import com.awb.app.user.dao.UserDao;
import com.awb.app.user.entity.User;
import com.awb.app.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserDao userDao;

    @Override
    public List selectUserRoleModuleByUsername(String username) {

        return userDao.selectUserRoleModuleByUsername(username);
    }

    @Override
    public User selectUserByUsername(String username) {
        return userDao.selectUserByUsername(username);
    }
}
