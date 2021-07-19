package com.matricstream.fullstack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @GetMapping("/isAdmin") 
    public String isAdmin() {
        return "This user is admin";
    }

    @GetMapping("/MyAccount")
    public String account() {
        return "You are an Authorised user";
    }

    @GetMapping("/notices")
    public String notices(){
        return "Login not needed";
    }
}
