package com.example.learn.service.Impl;

import com.example.learn.basic.Result;
import com.example.learn.entity.Api;
import com.example.learn.mapper.ApiMapper;
import com.example.learn.service.ApiService;
import com.example.learn.utils.ResultUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static com.example.learn.utils.Common.getDate;

@Service
public class ApiServiceImp implements ApiService {

    @Resource
    private ApiMapper apiMapper;


    private Result result;


    //查找
    @Override
    public Result selectAllApi() {

        List<Api> apiList = apiMapper.selectAll() ;
        if (apiList.size()==0){
            Result result = ResultUtil.success("null");
            return result;
        }
        else {
            Result result = ResultUtil.success(apiList);
            return result;
        }
    }

    //查看某条api信息的详情
    @Override
    public Result seleOneApi(String id) {
        int iid = Integer.parseInt(id);

        List<Api> apiList = apiMapper.selectDetail(iid);
        result = ResultUtil.success(apiList);

        return result;
    }

    //添加
    @Override
    public Result addApi(Api apiRecord) {
        apiRecord.setStatus(1);
        apiRecord.setCreateTime(getDate());
        apiRecord.setUpdateTime(getDate());
        apiMapper.insert(apiRecord);
        result = ResultUtil.success("数据插入成功");

        return  result;
    }

    @Override
    public Result deleteApi(String[] ids) {
        if (ids!=null){
            for (String id:ids){
                try{
                    int iid = Integer.parseInt(id);
                    boolean res = apiMapper.deleteApiInfo(iid);
                    if (res==true){
                        result = ResultUtil.success("数据删除成功"+"共删除"+ids.length+"条");
                        //return result;
                    }
                    else {
                        result = ResultUtil.faild("删除失败");
                        //return result;
                    }

                }catch (NumberFormatException e){
                    e.printStackTrace();
                    result=ResultUtil.faild("NumberFormatException");
                    //return result;
                }

            }

        }

        return result;
    }

    //修改信息
    @Override
    public Result updateApi(Api api) {

        int n = apiMapper.updateApiInfo(api.getId());
        if (n==1){
            result=ResultUtil.success(api);
        }
        else {
            result = ResultUtil.faild("更新失败");
        }

        return result;
    }


}
