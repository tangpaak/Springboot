package com.example.demoshopping.model;

import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
  private long id;
  private long customerId;
  private List<Item> items;
  
  
}
