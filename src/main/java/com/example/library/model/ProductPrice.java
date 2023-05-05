package com.example.library.model;

public class ProductPrice {
  public int getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(int basePrice) {
    this.basePrice = basePrice;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

  private int basePrice;
  private double totalPrice;
}
