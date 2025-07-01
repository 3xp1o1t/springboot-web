package com.jmontiel.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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

  @GetMapping("/list")
  public String listString(ModelMap model) {
    List<User> users = Arrays.asList(
      new User("Jesus", "Montiel", "jes.monti@acme.com"),
      new User("Angelica", "Mendoza", "angy@acme.com"),
      new User("Pedro", "Barajas", "perico@acme.com"),
      new User("Carmen", "Montiel")
    );

    model.addAttribute("users", users);
    model.addAttribute("title", "Lista de usuarios");

    return "list";
  }
}
