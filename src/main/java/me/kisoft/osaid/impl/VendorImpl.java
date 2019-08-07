/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kisoft.osaid.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import me.kisoft.osaid.entity.Vendable;
import me.kisoft.osaid.interfaces.MoneySlot;
import me.kisoft.osaid.interfaces.SnackSlot;
import me.kisoft.osaid.interfaces.Vendor;

/**
 *
 * @author tareq
 */
public class VendorImpl extends Vendor {

  @Override
  public List<MoneySlot> getMoneySlots() {
    return Arrays.asList(new CashMoneySlot());
  }

  @Override
  public SnackSlot getSnackSlot() {
    return new SnackSlotImpl();
  }

  @Override
  public HashMap<Vendable, Integer> getStock() {
    HashMap m = new HashMap();
    m.put(new Vendable(33f, "test"), 1);
    return m;
  }

  @Override
  public void returnChange(float change) {
    System.out.println("Returning :" + change);
  }

}
