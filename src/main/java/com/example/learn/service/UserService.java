package com.example.learn.service;

import com.example.learn.basic.Result;
import com.example.learn.entity.User;

import java.util.List;


public interface UserService {
     Result addUser(User user);

    /**List<User> selectUserByname();**/

    /**用户登录，通过查找用户名和密码的一致性**/
    Result selectUserInfo(User user);

    /** 查找用户信息展示**/
    List<User> getUserInfo();

}
