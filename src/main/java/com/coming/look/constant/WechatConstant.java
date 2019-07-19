package com.coming.look.constant;

/**
 *
 *
 * @author yigang.wu
 * @date created in $time $date
 */
public class WechatConstant {
    /**服务器的域名地址*/
    public static final String appId = "wx32c203ef6a2494a6";
    public static final String appsecret = "fcc641bc4a5796fcb13ccf1cf3a11114";

    /**获取openId和seesion_id*/
    public final static String getOpenIdUrl ="https://api.weixin.qq.com/sns/jscode2session?appid=${appid}&secret=${secret}&js_code=${code}&grant_type=authorization_code";
}
