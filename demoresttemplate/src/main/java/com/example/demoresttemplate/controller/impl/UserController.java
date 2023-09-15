package com.example.demoresttemplate.controller.impl;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoresttemplate.config.AppConfig;
import com.example.demoresttemplate.controller.UserOperation;
import com.example.demoresttemplate.model.User;
import com.example.demoresttemplate.service.UserService;
import com.example.demoresttemplate.service.impl.UserServiceImpl;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController implements UserOperation {

  @Autowired
  UserService userService;

  @Override
  public List<User> findUsers() {
    AppConfig appConfig = new AppConfig();
    return userService.findUsers();
  }

  @Override
  public User findById(Long id) {
    // if (id != 0L) {
    // try {
    // long Userid = Integer.valueOf(id);
    // return userService.find(id).orElse(null);
    // } catch (NumberFormatException e) {
    // return null;
    // }
    // }
    // return null;
    return userService.findById(id);

  }

  // @Override
  // public List<User> findAll(){
  // AppConfig appConfig = new AppConfig();
  // return userService.findAll();
  // }



}
