package com.coming.look.controller;

import com.coming.look.domain.DressResponse;
import com.coming.look.domain.Shop;
import com.coming.look.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商铺controller
 * @Date: 2019/7/10
 * @Description
 */
@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping("/list")
    @ResponseBody
    public DressResponse list(){
        List<Shop> shopList = shopService.listShops();
        return new DressResponse(true,shopList);
    }

    @RequestMapping("/qryShopById")
    @ResponseBody
    public DressResponse qryShopById(@RequestParam("shopId")Long shopId){
        Shop shop = shopService.qryShopById(shopId);
        return new DressResponse(true,shop);
    }
}
