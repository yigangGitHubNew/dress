package com.coming.look.controller;

import com.coming.look.domain.DressResponse;
import com.coming.look.domain.Shop;
import com.coming.look.domain.Store;
import com.coming.look.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 店铺controller
 * @Date: 2019/7/10
 * @Description
 */
@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @RequestMapping("/list")
    @ResponseBody
    public DressResponse list(Long shopId){
        List<Store> storeList = storeService.listStore(shopId);
        return new DressResponse(true,storeList);
    }

    @RequestMapping("/qryStoreById")
    @ResponseBody
    public DressResponse qryStoreById(Long storeId){
        Store store = storeService.qryStoreById(storeId);
        return new DressResponse(true,store);
    }
}
