package com.example.demoresttemplate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter // Getter + No-args constructor
@AllArgsConstructor
@NoArgsConstructor // Jaskson
public class User {
  private long id;
  private String name;
  private String username;
  private String email;
  private Adderss address;
  private String phone;
  private String website;
  private Company company;

  @Getter
  public static class Adderss {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    @Getter
    public static class Geo {
      private String lat;
      private String lng;
    }
  }

  @Getter
  public static class Company {
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