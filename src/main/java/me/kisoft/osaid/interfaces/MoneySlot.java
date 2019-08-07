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
public interface MoneySlot {

  /**
   * Gets the type of slot
   *
   * @return a string of the type of slot
   */
  public String getType();

  /**
   * Add this money if it is acceptable
   *
   * @param money the input money
   * @return the money if it is accepted, 0 otherwise
   */
  public float add(float money);

  /**
   * A string of acceptable denominations
   *
   * @return the acceptable denominations
   */
  public String getAcceptableDenominations();
}
