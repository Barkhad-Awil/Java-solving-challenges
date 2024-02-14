/*
 * Problem 5.8:
 * You are given an array of strings names, and an array heights that consists of distinct positive integers.
 * Both arrays are of length n.
 * For each index i, names[i] and heights[i] denote the name and height of the ith person.
 * Return names sorted in descending order by the people's heights.
 */

import java.util.Arrays;
import java.util.HashMap;

class Solution {

  public String[] sortPeople(String[] names, int[] heights) {
    //create hashMap
    HashMap<Integer, String> heightMap = new HashMap<>();

    //Populate the hashMap
    for (int i = 0; i < names.length; i++) {
      heightMap.put(heights[i], names[i]);
    }
    //sort the heights in assending order
    Arrays.sort(heights);

    //reverse the height array to get array sorted in desending order
    int[] reversedHeights = reverse(heights);

    //store sorted names into this array
    String[] sortedNames = new String[names.length];

    //populate the sortedNames
    for (int i = 0; i < sortedNames.length; i++) {
      sortedNames[i] = heightMap.get(reversedHeights[i]);
    }

    return sortedNames;
  }

  public int[] reverse(int[] heights) {
    int start = 0;
    int end = heights.length - 1;
    while (start < end) {
      int temp = heights[start];
      heights[start] = heights[end];
      heights[end] = temp;

      start++;
      end--;
    }

    return heights;
  }
}

/**
 * SortPeople
 */
public class SortPeople {

  public static void main(String... args) {
    Solution solution = new Solution();
    String[] names = { "Mary", "John", "Emma" };
    int[] heights = { 180, 165, 170 };

    String[] result = solution.sortPeople(names, heights);
    System.out.println(Arrays.toString(result));
  }
}
