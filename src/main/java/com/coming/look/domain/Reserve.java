package com.coming.look.domain;

import java.util.Date;

public class Reserve {
    /***/
    private Long id;

    /**商品的sku_id*/
    private Long skuInfoId;

    /**用户id*/
    private Long userId;

    /**0-未试衣 1-试衣期间 2-已过试衣时间 3-试衣成功*/
    private String status;

    /**试衣码*/
    private String code;

    /**预约的开始日期*/
    private String startDate;

    /**预约的开始时间*/
    private String startTime;

    /**预约的结束日期*/
    private String endDate;

    /**预约的结束时间*/
    private String endTime;

    private Date updateTime;

    /***/
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuInfoId() {
        return skuInfoId;
    }

    public void setSkuInfoId(Long skuInfoId) {
        this.skuInfoId = skuInfoId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
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
}