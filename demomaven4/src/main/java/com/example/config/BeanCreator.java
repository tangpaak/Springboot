package com.example.config;

import java.util.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Member of @Component
public class BeanCreator {

  // conservice.createArrayList()

  @Bean(name = "list1")
  public List<String> createArrayList() {
    return new ArrayList<>(); // return 乜野都係一個object
  }
  // Bean比左sping content
  // @Bean ...

  @Bean(name = "list2")
  public List<String> createLinkedList() {
    return new LinkedList<>(); // return 乜野都係一個object
  }

  @Bean(name = "list3")
  public List<String> createLinkedList1() {
    return new LinkedList<>(); // return 乜野都係一個object
  }

  @Bean(name = "HashSet1")
  public HashSet<String> createString(){
    return new HashSet<>();
  }

}
