import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem 6.6:
 * write a proram that find the difference of two arrays
 */

public class DifferenceOfTwoArray {

  public static List<List<Integer>> findDifferenceOfTwoArray(
    int[] nums1,
    int[] nums2
  ) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);

    List<List<Integer>> arr = new ArrayList<>();

    int n = nums1.length;
    int m = nums2.length;

    int i = 0; // this traverse the nums1[i] elements
    int j = 0; // this traverse the nums2[j] elements

    int x = 0; // this tracks the number of nums[i] elements added in to the arr list
    int y = 0; // this tracks the number of nums[j] elements added in to the arr list

    while (i < n && j < m) {
      if (nums1[i] < nums2[j]) {
        if (x < 1 || nums1[i] != arr.get(0).get(x - 1)) {
          arr.get(0).add(nums1[i]);
          x++;
        }
        i++;
      } else if (nums1[i] > nums2[j]) {
        j++;
      } else {
        i++;
      }
    }

    while (i < n) {
      if (x < 1 || nums1[i] != arr.get(0).get(x - 1)) {
        arr.get(0).add(nums1[i]);
        x++;
      }
      i++;
    }

    while (i < n && j < m) {
      if (nums2[j] < nums1[i]) {
        if (y < 1 || nums2[j] != arr.get(1).get(y - 1)) {
          arr.get(1).add(nums2[j]);
          y++;
        }
        j++;
      } else if (nums2[j] > nums1[i]) {
        i++;
      } else {
        j++;
      }
    }

    while (j < m) {
      if (y < 1 || nums2[j] != arr.get(1).get(y - 1)) {
        arr.get(1).add(nums2[j]);
        y++;
      }
      j++;
    }
    return arr;
  }

  public static void main(String[] args) {}
}
