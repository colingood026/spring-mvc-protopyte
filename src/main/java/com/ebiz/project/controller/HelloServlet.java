package com.ebiz.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class HelloServlet{
    
    @RequestMapping("/hello")
    public String init(){
        System.out.println("hello");
        return "hello";
    }

}
