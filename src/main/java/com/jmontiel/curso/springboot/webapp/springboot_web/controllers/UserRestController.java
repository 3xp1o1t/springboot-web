package com.jmontiel.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmontiel.curso.springboot.webapp.springboot_web.models.User;


@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/details")
  public Map<String, Object> details() {
    User user = new User("Jesus", "Montiel");
    Map<String, Object> model = new HashMap<>();
    model.put("title", "Parametros desde controlador");
    model.put("user", user);
    return model;
  }
}
