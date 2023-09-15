package com.example.service.impl;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.controller.HelloWorldController;
import com.example.service.HelloWorldService;


@Service //business logic

public class HelloWorldServiceImpl implements HelloWorldService{

  @Override
  public String generate(int x){
    if(x>100)
    return " hello world!!! this is maven3";
    return "ABC";
  }
  
}
