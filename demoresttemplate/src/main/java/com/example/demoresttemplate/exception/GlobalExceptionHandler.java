package com.example.demoresttemplate.exception;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.example.demoresttemplate.infra.ApiResponse;
import com.example.demoresttemplate.infra.Code;
import com.example.demoresttemplate.model.UserDTO;


@RestControllerAdvice // @ResponseBody + @ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(value = JPHException.class)
  public ResponseEntity<ApiResponse<Void>> getUserExceptionHandler() {
    ApiResponse<Void> response = ApiResponse.<Void>builder() //
        .status(Code.JPH_NOTFOUND) //
        .data(null) //
        .build();
    return ResponseEntity.badRequest().body(response);
  }
}

// List<UserDTO