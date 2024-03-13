import java.util.HashMap;
import java.util.Map;

/*
 * Problem 6.6:
 * You are given an array nums consisting of positive integers.
 * Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
 * The frequency of an element is the number of occurrences of that element in the array.
 */

public class MaxFrequencyElements {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 2, 3, 4 };
    int maxFreq = countMaxFrequency(nums);
    System.out.println(maxFreq);
  }

  private static int countMaxFrequency(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int maxFreq = Integer.MIN_VALUE;

    for (int freq : map.values()) {
      maxFreq += Math.max(maxFreq, freq);
    }

    for (int freq : map.values()) {
      if (freq == maxFreq) {
        maxFreq += freq;
      }
    }

    return maxFreq;
  }
}
