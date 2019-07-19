package com.coming.look.dao;

import com.coming.look.domain.SkuInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SkuInfoMapper {

    List<SkuInfo> selectSkuDetails(@Param("goodsId")Long goodsId);

    List<SkuInfo> reserveList(@Param("userId")Long userId);
}