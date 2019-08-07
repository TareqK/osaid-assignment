/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kisoft.osaid.impl;

import me.kisoft.osaid.interfaces.SnackSlot;
import me.kisoft.osaid.entity.Vendable;

/**
 *
 * @author tareq
 */
public class SnackSlotImpl implements SnackSlot {

  @Override
  public Vendable selectItem() {
    return getVendables()[0][0];
  }

  @Override
  public Vendable[][] getVendables() {
    Vendable[][] vendables = {{new Vendable(44f, "test"), new Vendable(33f, "test2")}};
    return vendables;
  }

}
