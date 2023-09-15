package com.example.demoresttemplate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

  private long id;
  private String name;
  private String username;
  private String email;
  private Address address;
  private String phone;
  private String webste;
  private Company company;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Address {

  private String street;
  private String suite;
  private String zipcode;
  private Geo geo;

  @Data
  @AllArgsConstructor
  @NoArgsConstructor

  public class Geo {
    double lat;
    double lng;
  }
}

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Company {
private String name;
private String catchPhrase;
private String bs;

}

}


// public User 
// (String name, String username, String email, //
// Address address, Integer phone, String website, //
// Company company
// ){
// this.id = ++counter;
// this.name = name;
// this.username = username;
// this.email = email;
// this.address = address;
// this.phone = phone;
// this.website = website;
// this.company = company;
// }