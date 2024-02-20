import java.util.HashMap;
import java.util.Map;

/*
 * Challenge 5.9:
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 */
class MajorityElement {

  public int findMajorityOfElement(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();

    //add elements to the map
    for (int i = 0; i < nums.length; i++) map.put(
      nums[i],
      map.getOrDefault(nums[i], 0) + 1
    );

    //find the bigest value among the keys
    int maxValue = Integer.MIN_VALUE;
    for (int value : map.values()) if (value > maxValue) maxValue = value;

    //find the key that corresponds the maxValue
    int targetKey = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) if (
      entry.getValue() == maxValue
    ) targetKey = entry.getKey();

    return targetKey;
  }

  public static void main(String[] args) {
    MajorityElement mj = new MajorityElement();
    int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
    int result = mj.findMajorityOfElement(nums);
    System.out.println(result);
  }
}
