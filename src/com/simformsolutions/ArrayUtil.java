package com.simformsolutions;

public class ArrayUtil {

  //used for asecending order
  //you do not need to change sort method logic or modified for any reason
  public static final void sort(int[] a , valueComparator comparator) {
    for (int i=0 ; i < a.length ; i++){
      for (int j=i+1 ; j<a.length ; j++){
        if (comparator.compare(a[i] , a[j]) > 0){
          int temp = a[i];
          a[i] = a[j];
          a[j]=temp;
        }
      }
    }
  }

  //now for desending order we need change login from asecnding to decending or need new method for that
  //or it's used only for primitive data type
}

interface valueComparator{
  int compare(int value1 , int value2);
}


class AsecSortImplements implements valueComparator{
  @Override
  public int compare(int value1, int value2) {
    return value1 - value2;
  }
}

class DescSortImplements implements valueComparator{

  @Override
  public int compare(int value1, int value2) {
    return value2-value1;
  }
}

