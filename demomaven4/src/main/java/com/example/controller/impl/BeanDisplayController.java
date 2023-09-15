package com.example.controller.impl;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Demomaven4Application;
import com.example.controller.BeanDisplayer;


@RestController
@RequestMapping(value = "api/v1")
public class BeanDisplayController implements BeanDisplayer{

@Autowired
Demomaven4Application app;


  @Override
  public List<String> getAllBeans(){
    return Arrays.asList(app.getBeans());
  }



  
}

