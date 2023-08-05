package com.harpers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    @RequestMapping("/index")
    public String page(Model model) {
        model.addAttribute("mensaje", "Hola mundo");
        return "index";
    }
    
}
