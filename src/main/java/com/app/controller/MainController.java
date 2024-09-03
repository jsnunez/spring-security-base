package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index"; // Esto busca la plantilla index.html en src/main/resources/templates/
    }

    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Devuelve la vista login.html
    }

    @GetMapping("/home")
    public String home() {
        return "home"; // Devuelve la vista home.html para usuarios autenticados
    }
}
