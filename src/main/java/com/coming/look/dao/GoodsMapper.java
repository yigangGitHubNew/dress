package com.coming.look.dao;

import com.coming.look.domain.Goods;

import java.util.List;

public interface GoodsMapper {
    /**
     * 根据店铺id查询商品列表
     * @param storeId
     * @return
     */
    List<Goods> listGoods(Long storeId);
}