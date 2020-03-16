package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import com.example.demo.model.Result;
import com.example.demo.model.User;


@RestController
public class LoginController {
	

    @CrossOrigin
    @PostMapping(value = "/api/login")
    public Result login(@RequestBody User requestUser) {
        // 获取用户名和密码
        String username = requestUser.getUsername();
        String password = requestUser.getPassword();

        // 判断登录是否成功
        if (username.equals("admin") && password.equals("123456")) {
            return new Result(200);
        } else {
            System.out.println("用户名或密码有误！");
            return new Result(400);
        }
    }
    @GetMapping("/test")
    public String index() {
    	return "hello";
    }
}

