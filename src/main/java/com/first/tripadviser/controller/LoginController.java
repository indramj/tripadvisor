package com.first.tripadviser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public void login(){
    }

    @GetMapping("/logout")
    public void logout(){

    }


}
