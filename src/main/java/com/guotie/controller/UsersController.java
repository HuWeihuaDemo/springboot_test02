package com.guotie.controller;

import com.guotie.model.Users;
import com.guotie.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserServiceImpl usersServiceImpl;

    /**
     * 页面跳转
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

    /**
     * 添加用户
     */
    @RequestMapping("/addUser")
    public String addUser(Users users) {
        this.usersServiceImpl.addUser(users);
        return "ok";
    }

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findall")
    public List<Users> findUsersAll(Model model) {
        List<Users> list = this.usersServiceImpl.findUsersAll();
        model.addAttribute("list", list);
        return list;
    }
}