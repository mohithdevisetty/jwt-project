package com.mohithdev.jwt_project.dao;

import com.mohithdev.jwt_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepo extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
