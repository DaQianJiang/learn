package com.example.learn.basic;

import java.io.Serializable;

public enum ResultEnum implements Serializable {

    //全局
    SUCCESS(200,"success"),
    FAILD(4001,"faild"),

    //登录

    LOGININFOERRO(40001,"用户或密码错误"),
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code , String message) {
        this.code=code;
        this.message=message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
