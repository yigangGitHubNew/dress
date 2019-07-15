package com.coming.look.domain;

import java.util.Date;

/**
 * 商圈的实体类
 */
public class Shop {
    /***/
    private Long id;

    /**商圈名称*/
    private String shopName;

    /**经度*/
    private String longitude;

    /**纬度*/
    private String latitude;

    /**图片的地址*/
    private String imageUrl;

    /**商圈的地址*/
    private String address;

    /***/
    private Date createTime;

    /**商圈中店铺的总数*/
    private Integer total4Store;

    /**商圈中匹配店铺的数量*/
    private Integer count4MatchedStore;

    /**商圈中匹配商品的数量*/
    private Integer count4MatchedGoods;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getTotal4Store() {
        return total4Store;
    }

    public void setTotal4Store(Integer total4Store) {
        this.total4Store = total4Store;
    }

    public Integer getCount4MatchedStore() {
        return count4MatchedStore;
    }

    public void setCount4MatchedStore(Integer count4MatchedStore) {
        this.count4MatchedStore = count4MatchedStore;
    }

    public Integer getCount4MatchedGoods() {
        return count4MatchedGoods;
    }

    public void setCount4MatchedGoods(Integer count4MatchedGoods) {
        this.count4MatchedGoods = count4MatchedGoods;
    }
}