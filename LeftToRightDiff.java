/* 
    Exercise 1.3 Write a method named areFactors that takes an integer n
    and an array of integers, and returns true if the numbers in the array are all
    factors of n (which is to say that n is divisible by all of them).
*/

import java.util.Arrays;

public class LeftToRightDiff {

  public static boolean areFactors(int n, int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % n != 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (i + 1) * 2;
    }

    System.out.println(Arrays.toString(arr));
    boolean result = areFactors(2, arr);
    System.out.println(result);
  }
}
