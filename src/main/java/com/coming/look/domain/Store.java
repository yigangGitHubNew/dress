package com.coming.look.domain;

import java.util.Date;

public class Store {
    /***/
    private Long id;

    /**æ‰€å±žå•†é“ºçš„id*/
    private Long shopId;

    /**åº—é“ºå��ç§°*/
    private String storeName;

    /**åˆ›å»ºæ—¶é—´*/
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
}