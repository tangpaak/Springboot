package com.example.demoresttemplate.controller.impl;

import java.util.*;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoresttemplate.config.AppConfig;
import com.example.demoresttemplate.controller.UserOperation;
import com.example.demoresttemplate.infra.ApiResponse;
import com.example.demoresttemplate.infra.Code;
import com.example.demoresttemplate.mapper.UserMapper;
import com.example.demoresttemplate.model.User;
import com.example.demoresttemplate.model.UserDTO;
import com.example.demoresttemplate.service.UserService;
import com.example.demoresttemplate.service.impl.UserServiceImpl;



@RestController
@RequestMapping(value = "/api/v1")
public class UserController implements UserOperation {

  @Autowired
  UserService userService;

  // @Override
  // public List<User> findUsers1() { // This is for findById
  //   AppConfig appConfig = new AppConfig();
  //   return userService.findUsers2();
  // }

  // @Override
  // public User findById(Long id) {
  //   return userService.findById(id);
  // }

  @Override
  public ResponseEntity<ApiResponse<List<UserDTO>>> findUsers() throws Exception {
    List<User> users = userService.findUsers();

    // Conversion (user -> userDTO)
    List<UserDTO> userDTOs = users.stream() //
        .map(user -> UserMapper.map(user)) //
        .collect(Collectors.toList());

    ApiResponse<List<UserDTO>> response = ApiResponse.<List<UserDTO>>builder() //
        .ok() //
        .data(userDTOs) //
        .build();
    return ResponseEntity.ok().body(response);
  }



//   @Override
//   public ResponseEntity<ApiResponse<List<User>>> findUsers() {
//     List<User> users = userService.findUsers(); //
//     // Conversion (user -> userDTO)

//     if (users == null) {
//       ApiResponse<List<User>> response = ApiResponse.<List<UserDTO>>builder() //
//           .status(Code.JPH_NOTFOUND) // .ok()
//           .data(null) //
//           .build();

//       return ResponseEntity.badRequest().body(response);
//     }

//     ApiResponse<List<User>> response = ApiResponse.<List<UserDTO>>builder() //
//         .status(Code.OK) // .ok()
//         .data(userService.findUsers()) //
//         .build();

//     return ResponseEntity.ok().body(response);
//   }




}
