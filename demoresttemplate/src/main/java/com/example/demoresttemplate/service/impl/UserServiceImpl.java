package com.example.demoresttemplate.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.example.demoresttemplate.exception.JPHException;
import com.example.demoresttemplate.infra.BusinessException;
import com.example.demoresttemplate.infra.Code;
import com.example.demoresttemplate.infra.Protocol;
import com.example.demoresttemplate.model.User;
import com.example.demoresttemplate.service.UserService;


@Service
public class UserServiceImpl implements UserService { // Bean

  @Autowired
  private RestTemplate restTemplate; // from Context

  @Value(value = "${api.jsonplaceholder.domain}")
  private String jphDomain; // from yml

  @Value(value = "${api.jsonplaceholder.endpoints.user}")
  private String userEndpoint; // from yml

  @Override
  public List<User> findUsers() throws BusinessException {
    String url = UriComponentsBuilder.newInstance() //
        .scheme(Protocol.HTTPS.name()) //
        .host(jphDomain) //
        .path(userEndpoint) //
        .toUriString();

    System.out.println("url=" + url);
    // Invoke API + Jaskson Deserialization (JSON -> Object)
    // try {
    User[] users = restTemplate.getForObject(url, User[].class);
    // return Arrays.asList(users);
    // } catch (RestClientException e) {
    throw new JPHException(Code.JPH_NOTFOUND);
    // }
  }



  @Override
  public User findById(long id) {
    return this.findUsers2().stream() //
        .filter(e -> e.getId() == id)//
        .findFirst().orElse(null);
  }

  @Override
  public List<User> findUsers2() {
    return null;

  }
  // RestClientException return null就代表run time exception(我個design係咁諗)


}
