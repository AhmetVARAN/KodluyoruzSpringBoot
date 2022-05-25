package com.ahmetvaran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {
    //http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
    //@ResponseBody //bir sayfaya yönlendirmek istemiyorsa @ResponseBody eklenir
    public String getThymeleaf1(){

        return "thymeleaf1";    //thymeleaf1.html 'e yönlendirdik
    }
}
