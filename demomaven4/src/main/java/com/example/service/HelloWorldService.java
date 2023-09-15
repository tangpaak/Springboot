package com.example.service;

import java.util.List;
import org.springframework.stereotype.Service;

@Service //放野入去 係有個object 係個桶入面
public interface HelloWorldService {

  List<String> getStrings();


/** add
 * A method to x add y
 * @param x
 * @param y
 * @return x + y
 */

 Integer add(Integer x , Integer y);

 /** substract
  *  A method to substract x by y.
  * @param x - A int value (通常會有business meaning)
  * @param y - A int value
  * @return x - y 
  */
 
   int substract(int x , int y);
 }
 
