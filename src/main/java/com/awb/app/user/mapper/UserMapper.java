package com.awb.app.user.mapper;

import com.awb.app.user.entity.User;
import com.awb.app.user.entity.UserRoleModule;
import org.apache.ibatis.annotations.*;

import java.util.List;

//@Mapper
public interface UserMapper {

    /*@Results({
            @Result(property = "uid",column = "uid"),
            @Result(property = "username",column = "username"),
            @Result(property = "password",column = "password")
    })*/
    @Select("select * from user where username=#{username}")
    User selectUserByName(@Param("username")String username);


    /*@Results({
            @Result(property = "uid",column = "uid"),
            @Result(property = "username",column = "username"),
            @Result(property = "password",column = "password"),
            @Result(property = "rid",column = "rid"),
            @Result(property = "rname",column = "rname"),
            @Result(property = "mid",column = "mid"),
            @Result(property = "mname",column = "mname"),
    })*/
    @Select("SELECT u.uid,u.username,u.password,r.rid,r.rname,m.mid,m.mname" +
            " FROM USER u" +
            " LEFT JOIN user_role ur ON u.uid=ur.uid" +
            " LEFT JOIN role r on ur.rid=r.rid" +
            " LEFT JOIN module_role mr on r.rid=mr.rid" +
            " LEFT JOIN module m on mr.mid=m.mid where u.username=#{username}")
    List<UserRoleModule> selectUserRoleModuleByName(@Param("username")String username);

}
