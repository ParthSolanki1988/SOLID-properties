package com.simformsolutions.Liskov;

public class TestLiskov {

  /**
   * @Liskov Substitution principle : Objects of super class shall be replaced with objects of subclasses.
   */
  public static void testDrive(Vehicle vehicle){
    vehicle.start();
    vehicle.stop();
  }

  public static void main(String[] args) {
    testDrive(new Vehicle());
    testDrive(new Car());
    testDrive(new Bike());
  }
}
