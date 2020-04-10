package com.example.learn.mapper;

import com.example.learn.entity.Api;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApiMapper {
    //增
    int insert(Api record);

    //页面展示所有api信息的部分信息
    List<Api> selectAll();

    //查看某条api的详细信息
    List<Api> selectDetail(int id );

    //删除
    boolean deleteApiInfo(int id);

    //修改

    int updateApiInfo(int id);


}