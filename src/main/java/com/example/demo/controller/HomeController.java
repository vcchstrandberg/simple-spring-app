package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "Hello from Azure App Service!";
    }
    @GetMapping("/bapp")
    public String bapp(){
        return "Hello Bapp";
    }
    @GetMapping("/bopp")
    public String boppa(){
        return "Hello Bopp";
    }
    @GetMapping("/blipp")
    public String blipp(){
        return "Hello Blipp";
    }
}
