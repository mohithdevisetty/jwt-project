package com.mohithdev.jwt_project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Users {
    @Id
    private Integer id;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;
}
