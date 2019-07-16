package com.coming.look.dao;

import com.coming.look.domain.Store;

import java.util.List;

public interface StoreMapper {
    /**
     * 根据商圈id计算店铺个数
     * @param shopId
     * @return
     */
    int countStoreByShopId(Long shopId);

    /**
     * 查询店铺列表
     * @return
     * @param shopId
     */
    List<Store> listStore(Long shopId);

    /**
     * 根据店铺id查询单个店铺详情
     * @param storeId
     * @return
     */
    Store qryStoreById(Long storeId);
}