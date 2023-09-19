package com.example.demoproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class QuoteDTO {

  private double currentPrice; // c
  private double dayHigh; //h
  private double dayLow; //l
  private double dayOpen; //o
  private double PrevDayClose; //PC
  

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




