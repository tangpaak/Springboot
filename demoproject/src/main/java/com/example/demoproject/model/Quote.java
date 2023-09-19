package com.example.demoproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Quote {

  public double c;
  public double d;
  public double dp;
  public double h;
  public double l;
  public double o;
  public double pc;
  public int t;

// Explaination:

// c
// Current price

// d
// Change

// dp
// Percent change

// h
// High price of the day

// l
// Low price of the day

// o
// Open price of the day

// pc
// Previous close price
  
}
