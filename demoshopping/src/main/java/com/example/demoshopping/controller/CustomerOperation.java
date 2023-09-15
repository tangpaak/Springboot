package com.example.demoshopping.controller;


import java.util.*;
import java.time.LocalDate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demoshopping.model.Customer;

public interface CustomerOperation {


  // "/customer" -> endpoint
  @PostMapping(value = "/customer") // noun, No verb
  Customer create(@RequestParam String name, //
      @RequestParam String email, //
      @RequestParam LocalDate dob);

  @GetMapping(value = "/customer/{id}") // noun, No verb
  Customer find(@PathVariable(name = "id") String customerId);

  @PostMapping(value = "/customer2") // noun, No verb
  Customer createCustomer(@RequestBody Customer customer);

  @DeleteMapping(value = "/customer/{id}") // noun , no verb
  Customer remove(@PathVariable(name = "id") String customerId);

  @PutMapping(value = "/customer/{id}") // put ->table PK 成條record update
  Customer update(@PathVariable(name = "id") String id, //
      @RequestBody Customer customer);

  @PatchMapping(value = "/customer/id/{id}/email/{email}")
  Customer patchEmail(@PathVariable(name = "id") String id, @PathVariable(name = "email") String email); // noun , no verb

  @PatchMapping(value = "/customer/id/{id}/name/{name}")
  Customer patchName(@PathVariable(name = "id") String id, @PathVariable(name = "name") String name); // noun , no verb

  @GetMapping(value = "/customer/findAll")
  List<Customer> findAll();



}


