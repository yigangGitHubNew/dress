package com.coming.look.domain;

import java.util.Date;
import java.util.List;

/**
 * 店铺的实体类
 */
public class Store {
    /***/
    private Long id;

    /**所属商铺的id*/
    private Long shopId;

    /**店铺名称*/
    private String storeName;

    /**店铺的风格，多个风格用逗号分隔开*/
    private String storeStyle;

    /**店铺风格名称*/
    private List<String> storeStyleNames;

    /**创建时间*/
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStoreStyle() {
        return storeStyle;
    }

    public void setStoreStyle(String storeStyle) {
        this.storeStyle = storeStyle;
    }

    public List<String> getStoreStyleNames() {
        return storeStyleNames;
    }

    public void setStoreStyleNames(List<String> storeStyleNames) {
        this.storeStyleNames = storeStyleNames;
    }
}