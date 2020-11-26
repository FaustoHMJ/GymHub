package com.example.gymhub.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controle {
    

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/planos")
    public String planos(){
        return "planos";
    }

    @GetMapping("/shortcodes")
    public String shortcodes(){
        return "shortcodes";
    }

    @GetMapping("/simple_page")
    public String simple_page(){
        return "simple_page";
    }

}
