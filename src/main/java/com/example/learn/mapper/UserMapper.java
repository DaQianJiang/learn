package com.example.learn.mapper;

import com.example.learn.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface UserMapper {

    int insert(User record);


    List<User> selectAll();

    /**新增通过姓名查找用户**/

    List<User> selectByName(@Param("name") String name);

    /**登录时通过姓名及密码查找用户**/
    List<User> selectUserInfo(@Param("name") String name, @Param("password") String password);
}