package com.mertpolat.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class StartAPI {

    @GetMapping
    public String HiSpringTest(){
        return  "Spring Test";
    }
}
