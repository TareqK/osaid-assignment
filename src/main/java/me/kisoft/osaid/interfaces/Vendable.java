/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kisoft.osaid.interfaces;

/**
 *
 * @author tareq
 */
public interface Vendable extends Comparable {

  /**
   * Return the price of the item
   *
   * @return the price of the item
   */
  float getPrice();

  /**
   * return the name of the item
   *
   * @return the name of the item
   */
  String getName();

}
