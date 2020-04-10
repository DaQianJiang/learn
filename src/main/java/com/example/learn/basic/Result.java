package com.example.learn.basic;

import org.springframework.lang.Nullable;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public Result(@Nullable T data,Integer code, String message){
        this.code=code;
        this.message=message;
        this.data=data;

    }

    public Result() {
        super();
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
