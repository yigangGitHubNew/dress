package com.coming.look.controller;

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
    public String sayHello() {
        return "Hello,World!";
    }


}
