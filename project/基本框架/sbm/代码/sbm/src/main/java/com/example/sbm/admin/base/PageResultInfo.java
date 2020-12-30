package com.example.sbm.admin.base;

import java.util.ArrayList;
import java.util.List;

public class PageResultInfo {
    private int code=0;//成功的状态码  layui 中  0成功
    private boolean success;
    private String msg="请求数据成功";//状态信息
    private int count;//数据总数
    private List<?> data=new ArrayList();//数据列表
    private Integer page = 0; //页码
    private Integer pageSize=20; //页大小  easyUI 传过来的 参数名
    private Integer limit=20; //页大小  layui 传过来的参数名







    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<?> getData() {
        return data;
    }
    public void setData(List<?> data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
