package com.example.demo.controller;

import com.example.demo.entities.User;
import com.example.demo.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ApiController {
    @Autowired
    private UserService userService;

    @GetMapping("/data")
    public String getAllData(Model model) {
        List<User> entities = userService.getAllUsers();
        model.addAttribute("entities", entities);
        return "entities";
    }

}
