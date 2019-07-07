package com.coming.look.utils.webchat;

import com.alibaba.fastjson.JSONObject;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
public class JsonUtil {

    /**
     * 解析json字符串
     */
    public static JSONObject parseJsonStr(String jsonStr){
        JSONObject job = JSONObject.parseObject(jsonStr);
        System.out.println(job.get("access_token"));
        return job;
    }
}
