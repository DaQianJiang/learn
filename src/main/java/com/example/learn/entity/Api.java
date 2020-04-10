package com.example.learn.entity;

import java.io.Serializable;
import java.util.Date;

public class Api implements Serializable {
    private Integer id;

    private String des;

    private String protocal;

    private String host;

    private String port;

    private String method;

    private String path;

    private String requestHeader;

    private String param;

    private Integer userId;

    private Date createTime;

    private Date updateTime;

    private Integer projectId;

    private String assertInfo;

    private String cookis;

    private Integer status;

    private Integer mid;

    private String left1;

    private String left2;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public String getProtocal() {
        return protocal;
    }

    public void setProtocal(String protocal) {
        this.protocal = protocal == null ? null : protocal.trim();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(String requestHeader) {
        this.requestHeader = requestHeader == null ? null : requestHeader.trim();
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getAssertInfo() {
        return assertInfo;
    }

    public void setAssertInfo(String assertInfo) {
        this.assertInfo = assertInfo == null ? null : assertInfo.trim();
    }

    public String getCookis() {
        return cookis;
    }

    public void setCookis(String cookis) {
        this.cookis = cookis == null ? null : cookis.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getLeft1() {
        return left1;
    }

    public void setLeft1(String left1) {
        this.left1 = left1 == null ? null : left1.trim();
    }

    public String getLeft2() {
        return left2;
    }

    public void setLeft2(String left2) {
        this.left2 = left2 == null ? null : left2.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", des=").append(des);
        sb.append(", protocal=").append(protocal);
        sb.append(", host=").append(host);
        sb.append(", port=").append(port);
        sb.append(", method=").append(method);
        sb.append(", path=").append(path);
        sb.append(", requestHeader=").append(requestHeader);
        sb.append(", param=").append(param);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", projectId=").append(projectId);
        sb.append(", assertInfo=").append(assertInfo);
        sb.append(", cookis=").append(cookis);
        sb.append(", status=").append(status);
        sb.append(", mid=").append(mid);
        sb.append(", left1=").append(left1);
        sb.append(", left2=").append(left2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}