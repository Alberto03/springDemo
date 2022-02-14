package com.abscoder.springmvc.helloworld.controller;

import com.abscoder.springmvc.helloworld.model.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String handler(Model model){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World example with Spring MVC!");
        helloWorld.setDateTime(LocalDateTime.now().toString());
        model.addAttribute("helloWorld", helloWorld);
        return "helloworld";
    }

}
