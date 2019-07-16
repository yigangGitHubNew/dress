package com.coming.look.service;

import com.coming.look.domain.Reserve;

/**
 * 预约服务类
 * @Date: 2019/7/10
 * @Description
 */
public interface ReserveService {
    /**
     * 保存预约服务
     * @param reserve
     * @return
     */
    int saveReserve(Reserve reserve);

    /**
     * 更新预约列表
     * @param reserve
     * @return
     */
    int updateReserve(Reserve reserve);
}
