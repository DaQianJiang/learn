package com.example.learn.controller;


import com.example.learn.basic.Result;
import com.example.learn.basic.ResultEnum;
import com.example.learn.entity.User;
import com.example.learn.service.Impl.UserServiceImpl;
import com.example.learn.utils.ResultUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;



@RestController
@RequestMapping(value = "api/")
public class UserController {

    @Resource
    private UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/index" , method = RequestMethod.GET)
    public String  test(){
        //System.out.println("test");
        return "Login/login";
        //return "test";
    }

    @RequestMapping(value = "user/doRegist",method = RequestMethod.POST )
    public Result regist(@RequestBody User user){
        if (user.getName()==""){

            Result result = ResultUtil.faild("用户名不能为空");
            return result;
            //return "用户名不能为空";
        }
        if (user.getPassword()==""){
            Result result = ResultUtil.faild("密码不能为空");
            return result;

        }
        else {
           return userServiceImpl.addUser(user);

        }
    }
    /**用户登录**/
    @RequestMapping(value = "user/doLogin",method = RequestMethod.POST)
    public Result login(@RequestBody User user){
        if (user.getName()==""){

            Result result = ResultUtil.faild("用户名不能为空");
            return result;
        }
        if (user.getPassword()==""){

            Result result = ResultUtil.faild("密码不能为空");
            return result;
        }
        else {
            return userServiceImpl.selectUserInfo(user);


        }

    }

    /**查询用户信息**/

    @RequestMapping(value = "/user/info",method = RequestMethod.GET)
    public List<User> getUserInfo(){
        return userServiceImpl.getUserInfo();
    }


}
