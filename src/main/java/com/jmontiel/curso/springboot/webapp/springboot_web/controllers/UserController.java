package com.jmontiel.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  @GetMapping("/details")
  public String details(Model model) {
    model.addAttribute("title", "Parametros desde controlador");
    model.addAttribute("name", "Jesus");
    model.addAttribute("lastname", "Montiel");
    return "details";
  }
}
