package com.lab;

public class ShippingCalculator {

  public double calculate(double weight, String type) {
    if (weight <= 0) {
      throw new IllegalArgumentException("Weight must be positive");
    }

    // Sử dụng equalsIgnoreCase để tránh lỗi nếu truyền "express" thay vì "EXPRESS"
    if ("EXPRESS".equalsIgnoreCase(type)) {
      return (weight * 5000.0) + 20000.0;
    }

    if ("STANDARD".equalsIgnoreCase(type)) {
      return weight * 3000.0;
    }

    throw new IllegalArgumentException("Unknown type: " + type);
  }
}