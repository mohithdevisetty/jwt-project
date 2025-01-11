package com.mohithdev.jwt_project.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {

    @GetMapping("/home")
    public String home(HttpServletRequest request) {
        return ("<h1>Welcome home </h1>") + request.getSession().getId();
    }

    @GetMapping("/about")
    public String about(HttpServletRequest request) {
        return ("<h1>Welcome about </h1>") + request.getSession().getId();
    }
}
