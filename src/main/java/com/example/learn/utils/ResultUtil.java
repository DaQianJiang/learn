package com.example.learn.utils;

import com.example.learn.basic.Result;
import com.example.learn.basic.ResultEnum;
import jdk.internal.dynalink.beans.StaticClass;

public class ResultUtil {



    //成功 不带参数 code message
    public static Result success(){
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMessage(ResultEnum.SUCCESS.getMessage());
        return result;
    }

    //带data参数 成功 code message data
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMessage(ResultEnum.SUCCESS.getMessage());
        result.setData(object);
        return result;
    }

    //失败不带参数
    public static Result faild(ResultEnum resultEnum){
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMessage(resultEnum.getMessage());
        return result;
    }

    //失败带参数
    public static Result faild(ResultEnum resultEnum,Object object){
        Result result = new Result();
        result.setMessage(resultEnum.getMessage());
        result.setCode(resultEnum.getCode());
        result.setData(object);
        return result;

    }
    public static Result faild(){
        Result result = new Result();
        result.setCode(ResultEnum.FAILD.getCode());
        result.setMessage(ResultEnum.FAILD.getMessage());
        return result;
    }

    public static Result faild(Object object){
        Result result = new Result();
        result.setCode(ResultEnum.FAILD.getCode());
        result.setMessage(ResultEnum.FAILD.getMessage());
        result.setData(object);
        return result;
    }


}
