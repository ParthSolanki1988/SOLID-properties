package com.simformsolutions.InterfaceSegregation;

public class ABCResturant implements VegResturant {


  @Override
  public void vegFood() {
    System.out.println("Only veg Food Allowed");
  }
}
