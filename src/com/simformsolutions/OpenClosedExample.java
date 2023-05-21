package com.simformsolutions;

public class OpenClosedExample {
  public static void main(String[] args) {
    int arr[] = {1,5,4,2,3};
    ArrayUtil.sort(arr,new DescSortImplements());
    for (int sortedArray:
         arr) {
      System.out.println(sortedArray);
    }
  }
}

