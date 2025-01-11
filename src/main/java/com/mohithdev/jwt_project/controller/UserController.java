package com.mohithdev.jwt_project.controller;

import com.mohithdev.jwt_project.model.User;
import com.mohithdev.jwt_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public User registeruser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
