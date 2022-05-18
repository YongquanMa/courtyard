package com.example.courtyard.controller;

import com.example.courtyard.entity.User;
import com.example.courtyard.entity.UserRole;
import com.example.courtyard.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    private RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping("/register")
    public void addGuest(@RequestBody User user) {
        registerService.add(user, UserRole.ROLE_RESIDENT);
    }

}