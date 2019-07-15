package com.coming.look.domain;

import java.util.Date;

/**
 * 图片实体类
 */
public class Picture {
    /***/
    private Long id;

    /**占位id*/
    private Long holderId;

    /**是否启用 0-否 1-启用*/
    private String isStart;

    /**图片的地址*/
    private String url;

    /**分类 比如店铺，商品呀，商圈呀等等*/
    private String classify;

    /***/
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHolderId() {
        return holderId;
    }

    public void setHolderId(Long holderId) {
        this.holderId = holderId;
    }

    public String getIsStart() {
        return isStart;
    }

    public void setIsStart(String isStart) {
        this.isStart = isStart == null ? null : isStart.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}