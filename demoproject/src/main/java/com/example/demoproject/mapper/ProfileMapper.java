package com.example.demoproject.mapper;

import com.example.demoproject.model.Profile;
import com.example.demoproject.model.ProfileDTO;
import com.example.demoproject.model.Quote;
import lombok.Builder;

@Builder
public class ProfileMapper {
  
public static ProfileDTO map(Profile profile){

return ProfileDTO.builder()//
.companyprofile(
  ProfileDTO.CompanyProfile.builder()
.country(profile.getCountry())//
.companyName(profile.getName())//
.ipoDate(profile.getIpo())//
.logo(profile.getLogo())//
.marketCap(profile.getMarketCapitalization())//
.currency(profile.getCurrency())//
.build()) //
.build()
;


}
// Company Profile:
// country
// comapnyName
// ipoDate
// logo
// marketCap
// currency

  
}
