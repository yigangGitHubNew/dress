package com.coming.look.controller;

import com.coming.look.domain.DressResponse;
import com.coming.look.domain.Picture;
import com.coming.look.domain.Reserve;
import com.coming.look.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 预约controller
 * @Date: 2019/7/10
 * @Description
 */
@RestController
@RequestMapping("/reserve")
public class ReserveController {

    @Autowired
    private ReserveService reserveService;

    @RequestMapping("/saveOrUpdateReserve")
    @ResponseBody
    public DressResponse saveOrUpdateReserve(Reserve reserve){
        Long id = reserve.getId();
        int count = 0;
        if(id == null){
            count = reserveService.saveReserve(reserve);
        }else{
            count = reserveService.updateReserve(reserve);
        }
        return new DressResponse(true,count);
    }
}
