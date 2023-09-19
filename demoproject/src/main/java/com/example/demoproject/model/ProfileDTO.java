package com.example.demoproject.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ch.qos.logback.core.joran.spi.NoAutoStart;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileDTO {

  private CompanyProfile companyprofile;

  @Getter
  @AllArgsConstructor
  @NoArgsConstructor
  @Builder
  public static class CompanyProfile {
    private String country;
    private String companyName;
    private String ipoDate; // ipoDate
    private String logo;
    private double marketCap;
    private String currency;
  }



  // @JsonProperty("x")
  // private String



}
