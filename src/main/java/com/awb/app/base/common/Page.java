package com.awb.app.base.common;

import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;

public class Page implements Serializable {

    public final static Integer DEFAULT_PAGE_ON=1;

    public final static Integer DEFAULT_PAGE_SIZE=10;

    public final static Integer CRM_DEFAULT_PAGE_SIZE=20;

    // 当前页码
    private Integer pageOn;

    // 每页显示数量
    private Integer pageSize;

    // 总页数
    private Integer totalPage;

    // 总记录数
    private Integer total;

    public Page() {
        this.pageOn=DEFAULT_PAGE_ON;
        this.pageSize=DEFAULT_PAGE_SIZE;
    }

    public Page(Integer pageOn) {
        this.pageOn = pageOn;
    }

    public Page(Integer pageOn, Integer pageSize) {
        if(pageOn==null){
            pageOn=Page.DEFAULT_PAGE_ON;
        }
        if(pageSize==null){
            pageSize=Page.DEFAULT_PAGE_SIZE;
        }
        this.pageOn = pageOn;
        this.pageSize = pageSize;
    }

    public RowBounds getPage(){
        int offset=(this.pageOn-1)*this.pageSize.intValue();
        if(offset<0){
            offset=0;
        }
        RowBounds page=new RowBounds(offset,this.pageSize.intValue());
        return page;
    }

    public Integer getPageOn() {
        return pageOn;
    }

    public void setPageOn(Integer pageOn) {
        this.pageOn = pageOn;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
        this.totalPage = (total + this.pageSize - 1) / this.pageSize;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageOn=" + pageOn +
                ", pageSize=" + pageSize +
                ", totalPage=" + totalPage +
                ", total=" + total +
                '}';
    }
}
