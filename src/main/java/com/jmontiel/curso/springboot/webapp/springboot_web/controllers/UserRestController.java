package com.jmontiel.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmontiel.curso.springboot.webapp.springboot_web.models.User;
import com.jmontiel.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

  // Using DTOs
  @GetMapping("/details")
  public UserDto details() {
    UserDto userDto = new UserDto();
    User user = new User("Jesus", "Montiel");
    userDto.setTitle("Hola mundo usando DTOs");
    userDto.setUser(user);
    return  userDto;
  }

  // USING MAP
  // @GetMapping("/details")
  // public Map<String, Object> details() {
  //   User user = new User("Jesus", "Montiel");
  //   Map<String, Object> model = new HashMap<>();
  //   model.put("title", "Parametros desde controlador");
  //   model.put("user", user);
  //   return model;
  // }
}
