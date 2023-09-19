package com.example.demoproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TargetDTO {

    private CompanyProfile companyprofile;
    private double currentPrice; // c
    private double dayHigh; //h
    private double dayLow; //l
    private double dayOpen; //o
    private double PrevDayClose; //PC

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



  
}
