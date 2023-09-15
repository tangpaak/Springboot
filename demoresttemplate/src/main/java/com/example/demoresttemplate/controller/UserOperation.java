package com.example.demoresttemplate.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demoresttemplate.model.User;

public interface UserOperation {
  
  
@GetMapping (value = "/user/{id}")
User findById(
  @PathVariable(name = "id") Long id);

@GetMapping(value = "/user/findAll")
List<User> findUsers();






}
