/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kisoft.osaid.entity;

import java.util.Objects;

/**
 *
 * @author tareq
 */
public class Vendable {

  private final float price;
  private final String name;

  public Vendable(float price, String name) {
    this.price = price;
    this.name = name;
  }

  public float getPrice() {
    return this.price;
  }

  /**
   * return the name of the item
   *
   * @return the name of the item
   */
  public String getName() {
    return this.name;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 23 * hash + Objects.hashCode(this.name);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Vendable other = (Vendable) obj;
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
    return true;
  }

}
