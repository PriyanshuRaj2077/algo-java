package com.Raj.MyFirstProduct.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
//    @RequestBody
    public String greet(){
//        System.out.println("hi......................................");
        return "welcome to TitanClub";
    }

    @RequestMapping("/about")
    public String About(){
        return "we are warriors";
    }
}
