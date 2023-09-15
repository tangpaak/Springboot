package com.example.service.impl;

import org.springframework.stereotype.Service;
import com.example.service.CalculatorService;

@Service //放野入去 係有個object 係個桶入面
public class CalculatorServiceImpl implements CalculatorService{

  @Override
  public Integer add(Integer x, Integer y){
    return x + y;
  }
  

  @Override
  public int substract(int x, int y){
    return x - y;
  }
}
