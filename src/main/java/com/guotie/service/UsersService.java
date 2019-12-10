package com.guotie.service;
import	java.util.List;

import com.guotie.model.Users;

public interface UsersService {
    void addUser(Users user);

    List<Users> findUsersAll();
}
