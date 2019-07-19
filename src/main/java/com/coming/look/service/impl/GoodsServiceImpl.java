package com.coming.look.service.impl;

import com.coming.look.dao.GoodsMapper;
import com.coming.look.dao.SkuInfoMapper;
import com.coming.look.domain.Goods;
import com.coming.look.domain.SkuInfo;
import com.coming.look.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品接口实现类
 * @Date: 2019/7/10
 * @Description
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private SkuInfoMapper skuInfoMapper;

    @Override
    public List<Goods> listGoods(Long storeId) {
        return goodsMapper.listGoods(storeId);
    }

    @Override
    public List<SkuInfo> reserveList(Long userId) {
        return skuInfoMapper.reserveList(userId);
    }

    @Override
    public List<SkuInfo> listSkuDetails(Long goodsId) {
        return skuInfoMapper.selectSkuDetails(goodsId);
    }
}
