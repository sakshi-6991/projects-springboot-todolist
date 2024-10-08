package com.project.todo.controller;

import com.project.todo.model.UserBean;
import com.project.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping({"/register","/create"})
    public ResponseEntity<?> registerUser(@RequestBody UserBean userBean){
        userService.registerUser(userBean);
        return new ResponseEntity<>("Successfully Registered",HttpStatus.OK);
    }
}
