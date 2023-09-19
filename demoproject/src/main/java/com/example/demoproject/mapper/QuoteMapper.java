package com.example.demoproject.mapper;

import com.example.demoproject.model.Quote;
import com.example.demoproject.model.QuoteDTO;
import lombok.Builder;

@Builder
public class QuoteMapper {

  public static QuoteDTO map (Quote quote){ //
  
  return QuoteDTO.builder()//
  .currentPrice(quote.getC()) //
  .dayHigh(quote.getH())//
  .dayLow(quote.getL())//
  .dayOpen(quote.getO())//
  .PrevDayClose(quote.getPc())
  .build()
  ;
}

  
  }
  
  

