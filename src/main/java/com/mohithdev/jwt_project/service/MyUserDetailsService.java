package com.mohithdev.jwt_project.service;

import com.mohithdev.jwt_project.dao.UsersRepo;
import com.mohithdev.jwt_project.model.UserPrincipal;
import com.mohithdev.jwt_project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UsersRepo usersRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> userOpt = usersRepo.findByUserName(username);
        if (userOpt.isEmpty()) {
            throw new UsernameNotFoundException("User not found with username : " + username);
        }
        User user = userOpt.get();

        return new UserPrincipal(user);
    }
}
