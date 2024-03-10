import java.util.HashMap;
import java.util.Map;

/*
 * Problem 6.5:
 * Given an integer array nums and an integer k,
 * return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
 * The value of |x| is defined as:
 * x if x >= 0.
 * -x if x < 0.
 */
public class CountArrayDiff {

  public static int countKDifferenceArray(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int result = 0;

    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i] - k)) {
        result += map.get(nums[i] - k);
      }

      if (map.containsKey(nums[i] + k)) {
        result += map.get(nums[i] + k);
      }

      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 2, 1 };
    int k = 1;

    int res = countKDifferenceArray(nums, k);
    System.out.println(res);
  }
}
