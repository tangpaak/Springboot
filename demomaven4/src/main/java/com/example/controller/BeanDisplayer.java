package com.example.controller;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;

public interface BeanDisplayer {

//1. http://127.0.0.1:8082/api/v1/beans
  @GetMapping(value = "/beans")
    List<String> getAllBeans();


  
  
}