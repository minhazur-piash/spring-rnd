package com.minhaz.home.jpa.controller;

import com.minhaz.home.jpa.entity.User;
import com.minhaz.home.jpa.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class LoginController {

    private LoginService loginService;

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping("/login")
    public ResponseEntity<User> login(@RequestParam("userName") String userName) {
        return ResponseEntity.ok(loginService.createUser(userName));
    }

}
