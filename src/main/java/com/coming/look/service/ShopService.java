package com.coming.look.service;

import com.coming.look.domain.Shop;

import java.util.List;

/**
 * 商圈服务接口
 * @Date: 2019/7/10
 * @Description
 */
public interface ShopService {
    /**
     * 查询商圈列表
     * @return
     */
    List<Shop> listShops();

    /**
     * 根据id查询相对应的商圈详情
     * @param shopId
     * @return
     */
    Shop qryShopById(Long shopId);
}
