package com.example.courtyard.controller;

import com.example.courtyard.entity.User;
import com.example.courtyard.entity.UserRole;
import com.example.courtyard.service.LoginService;
import com.example.courtyard.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public void login(@RequestBody User user) {
    }

}