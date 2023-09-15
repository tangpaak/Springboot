package com.example.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorOperation {

  // 1. add:
  // this is x10 + y20 = http://127.0.0.1:8081/api/v1/add?x=10&y=20

  @GetMapping(value = "/add")
  Integer add( //
      @RequestParam(name = "x") String salary, //
      @RequestParam(name = "y") String bonus, //
      @RequestParam(name = "z", required = false) String dividend, //
      @RequestParam String k //
  ); //

  // 2. substract:
  // http://127.0.0.1:8081/api/v1/substract/10/20/
  // http://127.0.0.1:8081/api/v1/substract/10/20/100

  @GetMapping(value = {"/substract/{x}/{y}/{z}", "/substract/{x}/{y}/"})
  Integer substract( //
      @PathVariable(name = "x") int salary, //
      @PathVariable int y, //
      @PathVariable(required = false) String z //
  );


}
