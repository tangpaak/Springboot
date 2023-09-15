package com.example.demoshopping.service;

import java.time.LocalDate;
import java.util.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demoshopping.model.Customer;

// public interface CustomerService {



// // @PostMapping(value = "/customer") //插入或修改數據之用, noun, no verb here
// Customer create(String name, String email, LocalDate dob);

// }

public interface CustomerService {
  
  Customer create(String name, String email, LocalDate dob);

  Optional<Customer> find(long customerId);

  Customer createCustomer(Customer customer);

  Optional<Customer> remove(long customerId);

  Customer update(long id, Customer customer);

  Customer patchEmail(long id, String email);

  Customer patchName(long id, String name);

  List<Customer> findAll();
  
}
