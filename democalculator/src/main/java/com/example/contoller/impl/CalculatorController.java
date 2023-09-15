package com.example.contoller.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.contoller.CalculatorOperation;
import com.example.service.CalculatorService;

@Controller //放野入去 係有個object 係個桶入面
@ResponseBody
@RequestMapping(value = "/api/v1")
public class CalculatorController implements CalculatorOperation{

//Autowire就係比緊一個任務部machine去攞野出黎, 而係我去指使machine去做既
  
@Autowired //攞野出黎 攞番個object出黎, 而呢個係你寫既, 本身果machine係唔會咁樣搵 只係佢咁岩見到你呢個autowire佢先會運行 runtime先會產生object
CalculatorService calculatorService; 

@Override 
public Integer add(String salary, String bonus, String dividend, String k){

  Integer d = 0;
  try {
  d = Integer.valueOf(dividend); //
  } catch (NumberFormatException e){
    d =0;
  }

  return calculatorService.add(Integer.valueOf(salary) + Integer.valueOf(bonus), Integer.valueOf(d));

}

@Override
public Integer substract(int x, int y, String z){
  return calculatorService.substract(x - y , 0);
}









}
