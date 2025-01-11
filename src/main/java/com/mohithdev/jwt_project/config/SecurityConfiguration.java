package com.mohithdev.jwt_project.config;

import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;

@EnableWebSecurity
public class SecurityConfiguration implements WebSecurityCustomizer {

    @Override
    public void customize(WebSecurity web) {

    }
}
