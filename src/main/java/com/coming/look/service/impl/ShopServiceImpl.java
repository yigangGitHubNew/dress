package com.coming.look.service.impl;

import com.coming.look.dao.ShopMapper;
import com.coming.look.dao.StoreMapper;
import com.coming.look.domain.Shop;
import com.coming.look.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 商圈服务的实现类
 * @Date: 2019/7/10
 * @Description
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public List<Shop> listShops() {
        List<Shop> shopList = shopMapper.listShop();
        if(!CollectionUtils.isEmpty(shopList)){
            for(Shop shop:shopList){
                Long shopId = shop.getId();
                int storeCount = storeMapper.countStoreByShopId(shopId);
                shop.setTotal4Store(storeCount);
                //先写死，后面要改为到数据库查询
                shop.setCount4MatchedStore(1);
                //先写死，后面要改为到数据库查询
                shop.setCount4MatchedGoods(6);
            }
        }
        return shopList;
    }

    @Override
    public Shop qryShopById(Long shopId) {
        Shop shop = shopMapper.qryShopById(shopId);
        return shop;
    }
}
