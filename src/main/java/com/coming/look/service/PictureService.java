package com.coming.look.service;

import com.coming.look.domain.Picture;

import java.util.List;

/**
 * @Date: 2019/7/16
 * @Description
 */
public interface PictureService {
    /**
     * 图片列表
     * @return
     * @param holderId
     * @param classify
     */
    List<Picture> listPicture(Long holderId, String classify);
}
