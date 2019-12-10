package com.guotie.mapper;

import com.guotie.model.Users;

import java.util.List;

public interface UsersMapper {
    void insertUsers(Users users);
    List<Users> selectUsersAll();
}
