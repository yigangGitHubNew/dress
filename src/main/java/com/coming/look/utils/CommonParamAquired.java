package com.coming.look.utils;

import com.alibaba.fastjson.JSONObject;
import com.coming.look.constant.WechatConstant;
import com.coming.look.utils.webchat.HttpClientHelper;
import com.coming.look.utils.webchat.JsonUtil;
import org.apache.log4j.Logger;

/**
 * 微信中普通参数的获取
 *
 * @author yigang.wu
 * @date created in $time $date
 */
public class CommonParamAquired {


    public static Logger logger = Logger.getLogger(CommonParamAquired.class);

    /**
     * 获取网页授权返回的相关信息
     * @return JSONObject
     */
    public static JSONObject aquiredAuthorizeInfo(String code) throws Exception{
        String authorizeTokenUrl = WechatConstant.getOpenIdUrl.
                replace("${appid}", WechatConstant.appId).
                replace("${secret}", WechatConstant.appsecret).
                replace("${code}", code);
        String responseStr = HttpClientHelper.requestGet(authorizeTokenUrl);
        logger.info("获取网页授权返回对象是"+responseStr);
        JSONObject job =  JsonUtil.parseJsonStr(responseStr);
        return job;
    }

    /**
     * 获取网页授权的openId
     * @return
     */
    public static String aquiredOpenId(JSONObject jsonObject) throws Exception{
        return jsonObject.get("openid").toString();
    }


    public static String aquiredSessionKey(JSONObject jsonObject) {
        return jsonObject.get("session_key").toString();
    }
}
