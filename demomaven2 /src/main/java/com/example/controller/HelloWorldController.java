package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@ResponseBody
@RequestMapping(value = "/api/v2")
public class HelloWorldController {

  @GetMapping(value = "/hello")
  public String helloworld() {
    return "helloworld";
  }

  @GetMapping(value = "/goodmorning")
  public String goodmorning() {
    return "goodmorning";
  }
}
