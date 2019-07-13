package com.coming.look.controller;

import com.coming.look.domain.DressResponse;
import com.coming.look.domain.Shop;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2019/6/29
 * @Description
 */
@RestController
public class HelloWorldController {


    @RequestMapping("/hello")
    @ResponseBody
    public DressResponse sayHello() {
        Shop shop = new Shop();
        shop.setAddress("杭州市江干区");
        return new DressResponse(true,shop);
    }


}
