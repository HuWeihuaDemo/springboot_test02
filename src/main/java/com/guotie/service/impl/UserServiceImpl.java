package com.guotie.service.impl;

import com.guotie.mapper.UsersMapper;
import com.guotie.model.Users;
import com.guotie.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void addUser(Users user) {
        this.usersMapper.insertUsers(user);
    }

    @Override
    public List<Users> findUsersAll() {
        return this.usersMapper.selectUsersAll();
    }
}
