package com.jmontiel.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jmontiel.curso.springboot.webapp.springboot_web.models.dto.ParamDto;
import com.jmontiel.curso.springboot.webapp.springboot_web.models.dto.ParamMixDto;


@RestController
@RequestMapping("/api/params")
public class RequestParamController {

  @GetMapping("/foo")
  public ParamDto foo(@RequestParam(required = false, defaultValue = "I think u miss something", name="mensaje") String message) {
    ParamDto param = new ParamDto();
    param.setMessage(message);
    return param;
  }

  @GetMapping("/bar")
  public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code) {
      ParamMixDto params = new ParamMixDto();
      params.setMessage(text);
      params.setCode(code);
      return params;
  }

}
