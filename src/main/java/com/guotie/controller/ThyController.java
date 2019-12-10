package com.guotie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThyController {
    @RequestMapping("/show")
    public String shoeInfo(Model module){
        module.addAttribute("msg","Thymeleaf demo测试~！");

        return "index";
    }
}
