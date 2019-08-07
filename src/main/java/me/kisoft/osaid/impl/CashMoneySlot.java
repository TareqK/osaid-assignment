/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kisoft.osaid.impl;

import me.kisoft.osaid.interfaces.MoneySlot;

/**
 *
 * @author tareq
 */
public class CashMoneySlot implements MoneySlot {

  @Override
  public String getType() {
    return "Cash";
  }

  @Override
  public float add(float money) {
    return money;
  }

  @Override
  public String getAcceptableDenominations() {
    return "Any";

  }

}
