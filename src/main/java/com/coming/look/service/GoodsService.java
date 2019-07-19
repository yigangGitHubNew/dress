package com.coming.look.service;

import com.coming.look.domain.Goods;
import com.coming.look.domain.SkuInfo;

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

    /**
     * 根据用户id查询预约商品
     * @param userId
     * @return
     */
    List<SkuInfo> reserveList(Long userId);

    /**
     * 查询商品的详细信息
     * @param goodsId
     * @return
     */
    List<SkuInfo> listSkuDetails(Long goodsId);
}
