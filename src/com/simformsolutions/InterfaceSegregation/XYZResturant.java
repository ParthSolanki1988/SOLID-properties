package com.simformsolutions.InterfaceSegregation;

public class XYZResturant implements VegResturant,NonVegResturant{


  @Override
  public void nonVegFood() {
    System.out.println("Non Veg food allowed");
  }

  @Override
  public void vegFood() {
    System.out.println("Also Veg food allowed");
  }
}
