package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @RequestMapping("/")
    public String StartPage(){
        return "StartPage";
    }

    @RequestMapping("/api")
    public String ShowDataPage(){
        return "ShowData";
    }
}
