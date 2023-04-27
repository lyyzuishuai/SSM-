package com.neuedu.entity;

import java.util.Date;
import java.util.List;

public class EasybuyOrder {

    private Integer id;

    private Integer userid;

    private String loginname;

    private String useraddress;

    private Date createtime;

    private Float cost;

    private String serialnumber;

    private List<EasybuyOrderDetail> details;

    private Integer product_id;

    public EasybuyOrder() {
    }

    public EasybuyOrder(Integer userid, String loginname, String useraddress, Float cost, String serialnumber) {
        this.userid = userid;
        this.loginname = loginname;
        this.useraddress = useraddress;
        this.cost = cost;
        this.serialnumber = serialnumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber == null ? null : serialnumber.trim();
    }

    public List<EasybuyOrderDetail> getDetails() {
        return details;
    }

    public void setDetails(List<EasybuyOrderDetail> details) {
        this.details = details;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
}