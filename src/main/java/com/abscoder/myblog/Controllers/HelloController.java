package com.abscoder.myblog.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/")
    public String index(){
        return "Greeting from Spring Boottttt!";
    }
/*
    @GetMapping("/say-hello")
    public String helloName(Model model, @RequestParam(name="name", defaultValue = "")String name){
        model.addAttribute("name", name.isBlank() ? "World": name);
        return "hello";
    }
 */
}
