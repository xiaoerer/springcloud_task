package com.awb.app.base.shiro;

import com.awb.app.user.entity.User;
import com.awb.app.user.entity.UserRoleModule;
import com.awb.app.user.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MyShiroRealm extends AuthorizingRealm {

    private static final Logger logger= LoggerFactory.getLogger(MyShiroRealm.class);

    @Autowired
    private IUserService userService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user= (User) principalCollection.fromRealm(this.getClass().getName()).iterator().next();//获取session中的用户
        List<UserRoleModule> list=userService.selectUserRoleModuleByUsername(user.getUsername());
        List<String> permissions=new ArrayList<>();
        if (null != list && list.size() > 0) {
            for (UserRoleModule userRoleModule :list) {
                permissions.add(userRoleModule.getMname());
            }
        }
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.addStringPermissions(permissions);//将权限放入shiro中.
        return info;
    }

    //认证登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken utoken= (UsernamePasswordToken) authenticationToken;  //获取用户输入的token
        String username=utoken.getUsername();
        User user=userService.selectUserByUsername(username);
        if(user!=null){
            return new SimpleAuthenticationInfo(user,user.getPassword(),this.getClass().getName());//放入shiro,调用CredentialsMatcher检验密码
        }
        return null;
    }
}
