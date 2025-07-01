package com.jmontiel.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jmontiel.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

  @GetMapping("/details")
  public String details(Model model) {
    User user = new User("Jesus", "Montiel");
    model.addAttribute("title", "Parametros desde controlador");
    model.addAttribute("user", user);
    return "details";
  }
}
