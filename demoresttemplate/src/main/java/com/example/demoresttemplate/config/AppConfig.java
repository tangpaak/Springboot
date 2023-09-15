package com.example.demoresttemplate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

  @Bean //(name  = "Rest")
  RestTemplate restTemplate(){
    // A tool/ class(libarary) to invoke third party APIs
    return new RestTemplate(); //lots of states/Variables
  }






  




  
}
