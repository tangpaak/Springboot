package com.example.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.controller.HelloWorldController;
import com.example.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller //放野入去 係有個object 係個桶入面
@ResponseBody
@RequestMapping(value = "/api/v1")
public class HelloWorldControllerImpl implements HelloWorldController {

//Autowire就係比緊一個任務部machine去攞野出黎, 而係我去指使machine去做既
  
@Autowired //攞野出黎 攞番個object出黎, 而呢個係你寫既, 本身果machine係唔會咁樣搵 只係佢咁岩見到你呢個autowire佢先會運行 runtime先會產生object
HelloWorldService helloworldService; 

@Autowired
@Qualifier(value = "list2")
List<String> s;


@Override
public List<String> getStrings() {
  s.add("hello");
  return helloworldService.getStrings();
}


@Override 
public Integer add(String salary, String bonus, String dividend, String k){

  Integer d = 0;
  try {
  d = Integer.valueOf(dividend); //
  } catch (NumberFormatException e){
    d =0;
  }

  return helloworldService.add(Integer.valueOf(salary) + Integer.valueOf(bonus), Integer.valueOf(d));

}

@Override
public Integer substract(int x, int y, String z){
  return helloworldService.substract(x - y , 0);
}


}

