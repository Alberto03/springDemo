package com.abscoder.myblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RootController {
    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("name", "World");
        return "index";
    }
/*
    @GetMapping("/say-hello")
    public String helloName(Model model, @RequestParam(name="name", defaultValue = "")String name){
        model.addAttribute("name", name.isBlank() ? "World": name);
        return "hello";
    }
 */
}
