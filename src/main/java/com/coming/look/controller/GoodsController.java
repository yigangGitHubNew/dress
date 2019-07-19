package com.coming.look.controller;

import com.coming.look.domain.DressResponse;
import com.coming.look.domain.Goods;
import com.coming.look.domain.Shop;
import com.coming.look.domain.SkuInfo;
import com.coming.look.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商铺的controller
 * @Date: 2019/7/10
 * @Description
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    @RequestMapping("/list")
    @ResponseBody
    public DressResponse list(Long storeId){
        List<Goods> shopList = goodsService.listGoods(storeId);
        return new DressResponse(true,shopList);
    }

    @RequestMapping("/reserveList")
    public DressResponse reserveList(Long userId){
        List<SkuInfo> goodsList = goodsService.reserveList(userId);
        return new DressResponse(true,goodsList);
    }

    @RequestMapping("/listGoodsDetail")
    @ResponseBody
    public DressResponse listGoodsDetail(Long goodsId){
        List<SkuInfo> skuInfoList = goodsService.listSkuDetails(goodsId);
        return new DressResponse(true,skuInfoList);
    }
}
