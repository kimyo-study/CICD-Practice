package com.kimyo.cicd.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloApi {

    @GetMapping("/")
    public String healthy(){
        return "HELLO KIMYO HI";
    }

}
