package com.awb.app.base.common;


import java.io.Serializable;

public class ServiceCall implements Serializable {

    /*
    状态码
     */
    private Integer id;

    /*
    提示信息
     */
    private String msg;

    /*
    具体内容
     */
    private Object data;

    /*
    分页信息
     */
    private Page page;

    public ServiceCall() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
