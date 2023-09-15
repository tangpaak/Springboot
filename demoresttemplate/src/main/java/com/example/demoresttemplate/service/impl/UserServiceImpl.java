package com.example.demoresttemplate.service.impl;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.example.demoresttemplate.model.User;
import com.example.demoresttemplate.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private RestTemplate restTemplate;

  @Value(value = "${api.jsonplaceholder.domain}") // find in yml, if doesn't find , error
  private String jphDomain; // jsonplaceholder.typicode.com

  @Value(value = "${api.jsonplaceholder.endpoint.user}")
  private String userEndpoint; // users

  @Override
  public List<User> findUsers() {
    String url = UriComponentsBuilder.newInstance() //
        .scheme("https") //
        .host(jphDomain) //
        .path(userEndpoint) //
        .toUriString();
    System.out.println("url=" + url);
    // Invoke API + Des
    User[] users = restTemplate.getForObject(url, User[].class);
    return Arrays.asList(users);
  }

  @Override
  public User findById(long id) {
    return this.findUsers().stream() //
        .filter(e -> e.getId() == id)//
        .findFirst().orElse(null);

  }


}


