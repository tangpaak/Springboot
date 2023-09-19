package com.example.demoproject.exception;

import com.example.demoproject.infra.BusinessException;
import com.example.demoproject.infra.Code;

public class FinnhubException extends BusinessException{
  
  public FinnhubException (Code code){
    super(code);
  }
}
