package com.jmontiel.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/details")
  public Map<String, Object> details() {
    Map<String, Object> model = new HashMap<>();
    model.put("title", "Parametros desde controlador");
    model.put("name", "Jesus");
    model.put("lastname", "Montiel");
    return model;
  }
}
