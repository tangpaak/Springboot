package com.example.demoshopping.controller.impl;

import java.time.LocalDate;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoshopping.config.AppConfig;
import com.example.demoshopping.controller.CustomerOperation;
import com.example.demoshopping.model.Customer;
import com.example.demoshopping.service.CustomerService;

@RestController
@RequestMapping(value = "/api/v1")
public class CustomerController implements CustomerOperation {

  @Autowired
  CustomerService customerService;

@Override
public List<Customer> findAll(){
  AppConfig appConfig = new AppConfig();

  return customerService.findAll();
}


  @Override
  public Customer create(String name, String email, LocalDate dob) {
    return customerService.create(name, email, dob);
  }


  @Override
  public Customer createCustomer(Customer customer) {
    return customerService.createCustomer(customer);
  }
  
  @Override
  public Customer find(String customerId) {
    if (!customerId.isBlank()) {
      try {
        long id = Integer.valueOf(customerId);
        return customerService.find(id).orElse(null);
      } catch (NumberFormatException e) {
        return null;
      }
    }
    return null;
  }



  @Override
  public Customer remove(String customerId) {
    if (!customerId.isBlank()) {
      try {
        long id = Integer.valueOf(customerId);
        return customerService.remove(id).orElse(null);
      } catch (NumberFormatException e) {
        return null;
      }
    }
    return null;
  }

  @Override
  public Customer update(String customerId, Customer customer) {
    if (!customerId.isBlank()) {
      try {
        long id = Integer.valueOf(customerId);
        return customerService.update(id, customer);
      } catch (NumberFormatException e) {
        return null;
      }
    }
    return null;
  }

  @Override
  public Customer patchEmail(String customerId, String email) {
    if (!customerId.isBlank()) {
      try {
        long id = Integer.valueOf(customerId);
        return customerService.patchEmail(id, email);
      } catch (NumberFormatException e) {
        return null;
      }
    }
    return null;
  }

  @Override
  public Customer patchName(String customerId, String name) {
    if (!customerId.isBlank()) {
      try {
        long id = Integer.valueOf(customerId);
        return customerService.patchName(id, name);
      } catch (NumberFormatException e) {
        return null;
      }
    }
    return null;
  }
}


