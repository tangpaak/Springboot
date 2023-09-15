package com.example.demoshopping.service.impl;


import java.time.LocalDate;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demoshopping.database.CustomerDataBase;
import com.example.demoshopping.model.Customer;
import com.example.demoshopping.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{


@Override 
public List<Customer> findAll(){
  return CustomerDataBase.findAll();
}
  
  @Override
  public Customer create(String name, String email, LocalDate dob) {
    Customer customer = Customer.builder() //
      .name(name)
      .email(email)
      .dob(dob)
      .build();
    CustomerDataBase.add(customer);
    return customer;
  }

  @Override
  public Optional<Customer> find(long customerId) {
    return CustomerDataBase.find(customerId);
  }

  @Override
  public Customer createCustomer(Customer customer) {
    CustomerDataBase.add(customer);
    return customer;
  }

  @Override
  public Optional<Customer> remove(long customerId) {
    return CustomerDataBase.remove(customerId);
  }

  @Override
  public Customer update(long id, Customer customer) {
    return CustomerDataBase.update(id, customer);
  }

  @Override
  public Customer patchEmail(long id, String email) {
    return CustomerDataBase.patchEmail(id, email);
  }

  @Override
  public Customer patchName(long id, String name) {
    return CustomerDataBase.patchName(id, name);
  }



}
