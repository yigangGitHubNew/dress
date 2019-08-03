package com.coming.look.utils;

import java.util.Date;

/**
 * @Date: 2019/8/1
 * @Description
 */
public class GeneratorRandom {

    public static String generateRandom(){
        long nowDate = System.currentTimeMillis();
        String sid = Integer.toHexString((int)nowDate);
        System.out.println(sid);
        return sid;
    }
}
