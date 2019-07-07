package com.coming.look.controller.wechat;/*
package com.coming.look.wechat.controller;

import com.alibaba.fastjson.JSONObject;
import com.coming.look.service.UserServiceImpl;
import com.coming.look.wechat.CommonParamAquired;
import com.coming.look.wechat.utils.RestResponse;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.UserServiceImpl;
import org.spring.springboot.wechat.CommonParamAquired;
import org.spring.springboot.wechat.utils.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

*/
/**
 * Created by bysocket on 07/02/2017.
 *//*

@RestController
@CrossOrigin
@RequestMapping(value="/wechat")
public class WeChatController {

    @Autowired
//    UserServiceImpl userService;

    @RequestMapping(value = "/entrance", method = RequestMethod.GET)
    public void wechatEntrance(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String signature = request.getParameter("signature");
        // 时间戳
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        // 随机字符串
        String echostr = request.getParameter("echostr");
        PrintWriter out = response.getWriter();
        if(!StringUtils.isEmpty(echostr)){
            out.print(echostr);
            System.out.println("签名是："+signature+";时间戳是："+timestamp+";随机数是："+nonce+";随机字符串是："+echostr);
        }else{
            out.print("hello wechat");
        }
        out.close();


    }

    @RequestMapping(value = "/authorize", method = RequestMethod.GET)
    public RestResponse<String> authorizeUrl(HttpServletRequest request, HttpServletResponse response, String code) throws Exception{
        RestResponse<String> restResponse = new RestResponse<String>();
        JSONObject jsonObject = CommonParamAquired.aquiredAuthorizeInfo(code);
        String openid = CommonParamAquired.aquiredOpenId(jsonObject);
        String accessToken = CommonParamAquired.authorizeAccessToken(jsonObject);
        String userInfoJson = CommonParamAquired.aquiredUserInfo(accessToken,openid);
//        userService.saveUser(userInfoJson);
        restResponse.setCode("ok");
        restResponse.setData("/authorize");
        return restResponse;
    }

    @RequestMapping(value = "/receiveMsg", method = RequestMethod.POST)
    public String receiveMsg(HttpServletRequest request, HttpServletResponse response,String code){
        RestResponse<String> restResponse = new RestResponse<String>();
        if(code == null || "".equals(code)){
            System.out.println("the code is null");
        }else{
            System.out.println("the code value is "+code);
        }
        restResponse.setCode("ok");
        restResponse.setData("/authorize");
        System.out.println(request.getAttribute("code"));
        System.out.println("The request is coming");
        return "您好，正忙，请稍等！";
    }

    @RequestMapping(value = "/do", method = RequestMethod.GET)
    public String doSomething(){
        return "do something";
    }
}
*/
