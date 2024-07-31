package com.example.M_Projecta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainClass {

    @GetMapping("/")
    public String home(){
        return "body";
    }
}
