package com.coming.look.service.impl;

import com.coming.look.dao.PictureMapper;
import com.coming.look.domain.Picture;
import com.coming.look.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date: 2019/7/16
 * @Description
 */
@Service
public class PictureServiceImpl implements PictureService{

    @Autowired
    private PictureMapper pictureMapper;

    @Override
    public List<Picture> listPicture(Long holderId, String classify) {
        return pictureMapper.listPicture(holderId,classify);
    }
}
