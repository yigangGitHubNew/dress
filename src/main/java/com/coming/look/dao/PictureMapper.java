package com.coming.look.dao;

import com.coming.look.domain.Picture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PictureMapper {
    /**
     * 图片列表
     * @param holderId
     * @param classify
     * @return
     */
    List<Picture> listPicture(@Param("holderId") Long holderId, @Param("classify") String classify);
}