package com.coming.look.service;

import com.coming.look.domain.Goods;

import java.util.List;

/**
 * 商品的服务接口
 * @Date: 2019/7/10
 * @Description
 */
public interface GoodsService {
    /**
     * 商品列表
     * @return
     * @param storeId
     */
    List<Goods> listGoods(Long storeId);
}
