package com.yawei.mapper;

import com.yawei.pojo.User;

public interface UserMapper {
    void save(User user);
    User findById(Integer id);
}
