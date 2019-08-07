/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kisoft.osaid.interfaces;

import me.kisoft.osaid.entity.Vendable;

/**
 *
 * @author tareq
 */
public interface SnackSlot {

  /**
   * Ask a user to enter and select an item by its row/column in the vendable
   *
   * @return an item;
   */
  Vendable selectItem();

  /**
   * Gets the list of vendables
   *
   * @return a list of vendables
   */
  Vendable[][] getVendables();
}
