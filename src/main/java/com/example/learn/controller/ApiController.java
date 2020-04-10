package com.example.learn.controller;


import com.example.learn.basic.Result;
import com.example.learn.entity.Api;
import com.example.learn.service.ApiService;
import com.example.learn.service.Impl.ApiServiceImp;
import com.example.learn.utils.ResultUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Resource
    private ApiService apiService;



    @RequestMapping(value = "getApiInfo",method = RequestMethod.GET)
    //查询所有api信息列表
    public Result selectApiInfo(){
        return apiService.selectAllApi();

    }

    //查询某条api详细信息

    //添加api信息
    @RequestMapping(value = "/addApiInfo",method = RequestMethod.POST)
    public Result addApiInfo(@RequestBody Api apiRecord){
        return apiService.addApi(apiRecord);

    }

    //删除api信息
    @RequestMapping(value = "/deleteApi",method = RequestMethod.POST)
    //同时删除多个用String ids做参数
    public Result deleteApi(String[] ids){

        return apiService.deleteApi(ids);
    }



    //修改api信息
    @RequestMapping(value = "/updateApi",method = RequestMethod.POST)

    public Result updateApi(@RequestBody Api api){


        return apiService.updateApi(api);
    }
}
