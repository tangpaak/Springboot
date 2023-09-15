package com.example.demoshopping.database;

import java.util.*;
import com.example.demoshopping.model.Cart;

public class CartDataBase {
  public static List<Cart> carts = new ArrayList<>();

  /**
   * remove cart by customer id from List<Cart>
   * 
   * @param customerId
   */
  public static void remove(int customerId) {

  }

  public static void add(Cart cart) {
    carts.add(cart);
  }

  
}
