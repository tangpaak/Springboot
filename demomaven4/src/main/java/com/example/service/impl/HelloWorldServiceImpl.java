package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.controller.HelloWorldController;
import com.example.service.HelloWorldService;


@Service //放野入去 係有個object 係個桶入面
public class HelloWorldServiceImpl implements HelloWorldService{

  //

@Autowired
@Qualifier (value = "list2")
private List<String> strings; //搵config既bean

@Override
public List<String> getStrings(){
  // List<String> strings = new ArrayList<>();
strings.add("abc");
strings.add("def");
strings.add("hig");
return strings;
}


  @Override
  public Integer add(Integer x, Integer y){
    return x + y;
  }
  

  @Override
  public int substract(int x, int y){
    return x - y;
  }
}
