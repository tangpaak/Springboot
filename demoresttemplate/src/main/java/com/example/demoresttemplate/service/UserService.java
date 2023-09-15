package com.example.demoresttemplate.service;

import java.util.List;
import com.example.demoresttemplate.model.User;

public interface UserService {
  List<User> findUsers();

  User findById(long id);
  
}
