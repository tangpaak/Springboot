package com.example.demoproject.infra;

import lombok.Getter;

@Getter
public enum Code {
  OK(20000, "OK"), //設定40000-49999 係某d error(純設計) //人為控制既code係5位數字
  // 40000 - 49999
  NOTFOUND(40000, "Resource NOT FOUND"),
  JPH_NOTFOUND(40001, "finnhub RestClientException"),
  // Server
  SERVER_TIMEOUT(50000, "Server Timeout"),
  ;

  private int code;
  private String desc;

  private Code(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }



  
}
