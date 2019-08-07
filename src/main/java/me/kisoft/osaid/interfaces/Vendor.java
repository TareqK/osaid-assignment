/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kisoft.osaid.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tareq
 */
public abstract class Vendor {

  /**
   * gets the current selection and money. Additionaly, reduces the current stock for that item by 1
   */
  public void vend() {
    Vendable v = getSnackSlot().selectItem();
    System.out.println("You have selected : " + v.getName());
    if (getRemainingStock(v) > 0) {
      float m = getMonies(v.getPrice());
      getStock().put(v, getStock().get(v) - 1);
      float change = m - v.getPrice();
      if (change > 0) {
        returnChange(change);
      }
      System.out.println("Done vending item :" + v.getName());
    } else {
      System.out.println("This item is not available");
    }
  }

  /**
   * Gets the list of money slots
   *
   * @return a list of money slots
   */
  abstract List<MoneySlot> getMoneySlots();

  /**
   *
   * continues to accept money until the money is above a threshold
   *
   * @param monies the ammount of monies we need to get over
   * @return a float
   */
  public float getMonies(float monies) {
    float money = 0.0f;
    while (money < monies) {
      for (MoneySlot m : getMoneySlots()) {
        System.out.println("Would you like to enter money in the " + m.getType() + " slot?(y/n):");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.equals("y") || s.equals("yes")) {
          System.out.println("How much would you like to enter? Acceptable denominations : " + m.getAcceptableDenominations());
          String mon = in.nextLine();
          money += m.add(Float.valueOf(mon));
        }
      }
    }
    return money;
  }

  /**
   * Retruns the snackslot selection for this vendor
   *
   * @return a snackslot
   */
  public abstract SnackSlot getSnackSlot();

  /**
   * Get remaining amount of an item
   *
   * @param v the item to check
   * @return the number of items remaining of a venable
   */
  int getRemainingStock(Vendable v) {
    return getStock().get(v);
  }

  /**
   * Get the stock for items and vendables
   *
   * @return a set of items and their stock
   */
  public abstract HashMap<Vendable, Integer> getStock();

  /**
   * returns the remaining change
   *
   * @param change the change to return
   */
  public abstract void returnChange(float change);

}
