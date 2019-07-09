package com.coming.look.controller;

import com.coming.look.domain.DressResponse;
import com.coming.look.domain.User;
import com.coming.look.service.UserService;
import com.coming.look.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Date: 2019/6/30
 * @Description
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    @ResponseBody
    public DressResponse addUser() {
        User user = new User();
        user.setId(new IdGenerator().nextId());
        user.setCreateTime(new Date());
        user.setUserName("jerry");
        user.setBirthDay("2019-06-30");
        user.setAge(23);
        userService.addUser(user);
        return new DressResponse(true,user);
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public DressResponse deleteUser() {
        int count = userService.deleteUser();
        if(count > 0){
            return new DressResponse(true,count);
        }
        return new DressResponse(false,count);
    }
}
