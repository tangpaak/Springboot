package com.example.demoproject.mapper;

import com.example.demoproject.model.Profile;
import com.example.demoproject.model.Quote;
import com.example.demoproject.model.TargetDTO;

public class TargetMapper {
  
  public static TargetDTO map(Profile profile, Quote quote){
  return TargetDTO.builder()//
.companyprofile(
 TargetDTO.CompanyProfile.builder()
.country(profile.getCountry())//
.companyName(profile.getName())//
.ipoDate(profile.getIpo())//
.logo(profile.getLogo())//
.marketCap(profile.getMarketCapitalization())//
.currency(profile.getCurrency())//
.build())
.currentPrice(quote.getC()) //
.dayHigh(quote.getH())//
.dayLow(quote.getL())//
.dayOpen(quote.getO())//
.PrevDayClose(quote.getPc())
.build()
;
}


}