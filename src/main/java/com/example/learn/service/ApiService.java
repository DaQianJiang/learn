package com.example.learn.service;

import com.example.learn.basic.Result;
import com.example.learn.entity.Api;

import java.util.ArrayList;
import java.util.List;

public interface ApiService {

    //查找所有创建的api
    Result selectAllApi();

    //查找某条api的详细信息
    Result seleOneApi(String id);

    //添加api信息

    Result addApi(Api apiRecord);

    //删除api信息
    Result deleteApi(String[] ids);

    //修改api信息
    Result updateApi(Api api);

    //通过条件查询信息
}
