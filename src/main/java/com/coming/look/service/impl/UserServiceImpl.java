package com.coming.look.service.impl;

import com.coming.look.dao.UserMapper;
import com.coming.look.domain.User;
import com.coming.look.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Date: 2019/6/30
 * @Description
 */
@Component
public class UserServiceImpl implements UserService{


    @Autowired
    private UserMapper userMapper;


    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deleteUser() {
        return userMapper.deleteUser();
    }

    @Override
    public int updateUser(User user) {
        return userMapper.update(user);
    }
}
