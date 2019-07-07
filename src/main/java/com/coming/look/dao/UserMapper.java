package com.coming.look.dao;

import com.coming.look.domain.User;

public interface UserMapper {
    int insert(User record);

    int deleteUser();
}