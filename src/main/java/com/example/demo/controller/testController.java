package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/v1/nasdaq")
@Controller
public class testController {
    
    @GetMapping("/index")
    public String mainPage(){
        return "index";
    }
}
