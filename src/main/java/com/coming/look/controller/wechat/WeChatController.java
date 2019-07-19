package com.coming.look.controller.wechat;

import com.alibaba.fastjson.JSONObject;
import com.coming.look.domain.DressResponse;
import com.coming.look.domain.User;
import com.coming.look.service.UserService;
import com.coming.look.utils.CommonParamAquired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by bysocket on 07/02/2017.
 */

@RestController
@CrossOrigin
@RequestMapping(value="/wechat")
public class WeChatController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/authorize", method = RequestMethod.GET)
    public DressResponse authorizeUrl(HttpServletRequest request, HttpServletResponse response, String code) throws Exception{
        DressResponse restResponse = new DressResponse();
        JSONObject jsonObject = CommonParamAquired.aquiredAuthorizeInfo(code);
        String openid = CommonParamAquired.aquiredOpenId(jsonObject);
        String sessionKey = CommonParamAquired.aquiredSessionKey(jsonObject);
        User user = new User();
        user.setOpenId(openid);
        user.setSessionKey(sessionKey);
        user.setId(551657969901633536L);
        userService.updateUser(user);
        return restResponse;
    }
}
