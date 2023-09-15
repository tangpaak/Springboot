package com.example.service;


public interface CalculatorService {


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
