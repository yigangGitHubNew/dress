package com.coming.look.dao;

import com.coming.look.domain.Shop;

import java.util.List;

public interface ShopMapper {
    /**
     * 查询商圈列表
     * @return
     */
    List<Shop> listShop();

    /**
     * 查询单个商圈详情
     * @param shopId
     * @return
     */
    Shop qryShopById(Long shopId);
}