package com.example.demo.controller;

import com.example.demo.entities.User;
import com.example.demo.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        if (user.getName() == null) {
            throw new RuntimeException("Name is null in the request body");
        }
        return userService.saveUser(user);
    }

    
}
