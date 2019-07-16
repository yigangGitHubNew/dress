package com.coming.look.service.impl;

import com.coming.look.dao.StoreMapper;
import com.coming.look.domain.Store;
import com.coming.look.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date: 2019/7/10
 * @Description
 */
@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public List<Store> listStore(Long shopId) {
        List<Store> storeList = storeMapper.listStore(shopId);
        return storeList;
    }

    @Override
    public Store qryStoreById(Long storeId) {
        return storeMapper.qryStoreById(storeId);
    }
}
