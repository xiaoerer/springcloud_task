package com.awb.app.user.service;

import com.awb.app.user.entity.User;

import java.util.List;

public interface IUserService {

    //权限查询
    List selectUserRoleModuleByUsername(String username);

    User selectUserByUsername(String username);
    
}
