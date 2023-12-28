/*
 * Question 4.5:
 * You are given an integer array nums and an integer k.
 * Return an integer that denotes the sum of elements in nums 
 * whose corresponding indices have exactly k set bits in their binary representation
 * input nums = {5,10,1,5,2}; k = 1;
 * output = 13;
 */

public class SumOfValuesWithEqualSetBits{
    public static int sumIndicesWithKSetBits(int[] nums, int k){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(areEqualBits(i,k)){
                sum += nums[i];
            }
        }
        return sum;
    }

    public static boolean areEqualBits(int i, int k){
        boolean isEqual = false;
        int count = 0;
        char[] charArray = Integer.toBinaryString(i).toCharArray();
        for(char ch:charArray){
            if(Character.getNumericValue(ch) == 1) count++;
        
        }
        if(count == k){
            isEqual = true;
        }

        return isEqual;
    }

    public static void main(String...args){
        int[] nums = {5,10,1,5,2};
        int k = 1;
        int sum = sumIndicesWithKSetBits(nums, k);
        System.out.println(sum);

    }

}