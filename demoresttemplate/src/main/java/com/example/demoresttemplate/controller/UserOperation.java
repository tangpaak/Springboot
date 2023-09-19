package com.example.demoresttemplate.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demoresttemplate.infra.ApiResponse;
import com.example.demoresttemplate.model.User;
import com.example.demoresttemplate.model.UserDTO;

public interface UserOperation {
  
  
// @GetMapping (value = "/user/{id}")
// User findById(
//   @PathVariable(name = "id") Long id);

// @GetMapping(value = "/user/findAll")
// List<User> findUsers1();

// @GetMapping(value = "/users")
// ApiResponse<List<User>> findUsers();

@GetMapping(value = "/userDTO")
ResponseEntity<ApiResponse<List<UserDTO>>> findUsers() throws Exception;



}
