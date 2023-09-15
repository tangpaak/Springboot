package com.example.demoshopping.database;

import java.util.*;
import com.example.demoshopping.model.Customer;

public class CustomerDataBase {
  private static List<Customer> customers = new ArrayList<>();


  public static List<Customer> findAll() {
return customers;
  }

  public static void add(Customer customer) {
    customers.add(customer);
  }
  
  public static Optional<Customer> find(long id) {
    return customers.stream() //
        .filter(customer -> customer.getId() == id) //
        .findFirst();
  }

  public static Optional<Customer> remove(long id) {
    Optional<Customer> customer = find(id);
    
    if (customer.isPresent()) {
        customers.remove(customer.get());
        return customer;
    }
    return Optional.empty();
}

  public static Customer update(long id, Customer newCustomer) {
    if(!find(id).isPresent())
      return null;
    customers.stream()
      .filter(customer -> customer.getId() == id)
      .forEach(e -> {
        e.setDob(newCustomer.getDob());
        e.setEmail(newCustomer.getEmail());
        e.setName(newCustomer.getName());
      });
      return newCustomer;
  }

  public static Customer patchEmail(long id, String email) {
    Optional<Customer> customer = find(id);
    if(!customer.isPresent())
      return null;
    customers.stream()
      .filter(c -> c.getId() == id)
      .forEach(c -> {
        c.setEmail(email);
      });
      return customer.get();
  }

  public static Customer patchName(long id, String name) {
    Optional<Customer> customer = find(id);
    if(!customer.isPresent())
      return null;
    customers.stream()
      .filter(c -> c.getId() == id)
      .forEach(c -> {
        c.setName(name);
      });
      return customer.get();
  }

}
