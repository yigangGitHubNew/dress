package com.coming.look.service;

import com.coming.look.domain.Store;

import java.util.List;

/**
 * 店铺的服务接口
 * @Date: 2019/7/10
 * @Description
 */
public interface StoreService {
    /**
     * 查询店铺列表
     * @return
     * @param shopId
     */
    List<Store> listStore(Long shopId);

    /**
     * 根据店铺id查询单个店铺
     * @param storeId
     * @return
     */
    Store qryStoreById(Long storeId);
}
