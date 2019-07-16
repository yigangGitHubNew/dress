package com.coming.look.controller;

import com.coming.look.domain.DressResponse;
import com.coming.look.domain.Picture;
import com.coming.look.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 图片controller
 * @Date: 2019/7/16
 * @Description
 */
@RestController
@RequestMapping("/picture")
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/list")
    @ResponseBody
    public DressResponse list(Long holderId,String classify){
        List<Picture> pictureList = pictureService.listPicture(holderId,classify);
        return new DressResponse(true,pictureList);
    }
}
