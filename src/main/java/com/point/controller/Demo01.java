package com.point.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo01 {
    @RequestMapping("/demo")
    public String demo(){
       final String demo="开始";
        return demo;
    }
}
