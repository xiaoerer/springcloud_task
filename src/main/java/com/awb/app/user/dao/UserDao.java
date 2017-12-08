package com.awb.app.user.dao;

import com.awb.app.user.entity.User;
import com.awb.app.user.entity.UserRoleModule;
import com.awb.app.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    UserMapper userMapper;

    public User selectUserByUsername(String username){
        return userMapper.selectUserByName(username);
    }

    public List selectUserRoleModuleByUsername(String username){
        return userMapper.selectUserRoleModuleByName(username);
    }

}
