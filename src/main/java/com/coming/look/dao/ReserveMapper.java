package com.coming.look.dao;

import com.coming.look.domain.Reserve;

public interface ReserveMapper {
    int insert(Reserve reserve);

    int update(Reserve reserve);
}