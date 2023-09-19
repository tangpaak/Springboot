package com.example.demoproject.exception;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.example.demoproject.infra.ApiResponse;
import com.example.demoproject.infra.Code;



@RestControllerAdvice // @ResponseBody + @ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(value = FinnhubException.class)
  public ResponseEntity<ApiResponse<Void>> getUserExceptionHandler() {
    ApiResponse<Void> response = ApiResponse.<Void>builder() //
        .status(Code.JPH_NOTFOUND) //
        .data(null) //
        .build();
    return ResponseEntity.badRequest().body(response);
  }
}

