package com.example.learn.service.Impl;

import com.example.learn.basic.Result;
import com.example.learn.basic.ResultEnum;
import com.example.learn.entity.User;
import com.example.learn.mapper.UserMapper;
import com.example.learn.service.UserService;
import com.example.learn.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.logging.Logger;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

   // @Resource
    //private static final Logger logger = (Logger) LoggerFactory.getLogger(UserServiceImpl.class);


    @Override
    public Result addUser(User user) {
        List<User> userList = userMapper.selectByName(user.getName());
        if (userList.size()!=0){
            Result result = ResultUtil.faild("存在相同用户名，请重新输入");
            //Result result = ResultUtil.faild(ResultEnum.LOGININFOERRO);
            return result;


        }
        else {
            userMapper.insert(user);
            Result result = ResultUtil.success("用户注册成功");
            //Result result = ResultUtil.faild(ResultEnum.LOGININFOERRO);
            return result;
        }

    }
    /** 用户登录**/
    @Override
    public Result selectUserInfo(User user) {
        List<User> userListInfo = userMapper.selectUserInfo(user.getName(),user.getPassword());
        List<User> userListName = userMapper.selectByName(user.getName());
        if (userListName.size()==0){
           Result result = ResultUtil.faild("用户名或密码错误");
            //Result result = ResultUtil.faild(ResultEnum.LOGININFOERRO);
            return result;

        }
        else {
            if (userListInfo.size()==0){

                Result result = ResultUtil.faild("用户名或密码错误");
                //Result result = ResultUtil.faild(ResultEnum.LOGININFOERRO);
                return result;
            }
            else {
                Result result = ResultUtil.success("登录成功");
                return result;
            }
        }
    }

    /**查询用户信息**/
    @Override
    public List<User> getUserInfo() {
        return userMapper.selectAll();
    }
}
