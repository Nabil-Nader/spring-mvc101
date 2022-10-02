package com.ex.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping()
public class GreetingController {

    @GetMapping("/hello")
    public String greeting(ModelMap model){
        model.addAttribute("message", "Hello Billy");
        return  "hello";
    }
}
