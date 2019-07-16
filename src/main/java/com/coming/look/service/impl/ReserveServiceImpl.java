package com.coming.look.service.impl;

import com.coming.look.dao.ReserveMapper;
import com.coming.look.domain.Reserve;
import com.coming.look.service.ReserveService;
import com.coming.look.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Date: 2019/7/10
 * @Description
 */
@RestController
public class ReserveServiceImpl implements ReserveService{

    @Autowired
    private ReserveMapper reserveMapper;

    @Override
    public int saveReserve(Reserve reserve) {
        reserve.setId(new IdGenerator().nextId());
        reserve.setUpdateTime(new Date());
        reserve.setCreateTime(new Date());
        return reserveMapper.insert(reserve);
    }

    @Override
    public int updateReserve(Reserve reserve) {
        reserve.setUpdateTime(new Date());
        return reserveMapper.update(reserve);
    }
}
