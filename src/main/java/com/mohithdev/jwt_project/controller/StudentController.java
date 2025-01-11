package com.mohithdev.jwt_project.controller;

import com.mohithdev.jwt_project.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students=new ArrayList<>(List.of(
            new Student(1,"Mohith","Java"),
            new Student(2,"Kiran","Blockchain")
    ));

    @GetMapping("students")
    public List<Student> getStudents(){
        return students;
    }

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("students")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
    }
}
