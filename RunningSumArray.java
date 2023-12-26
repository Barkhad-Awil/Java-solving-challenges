
/*
 * Question 4.1: 
* Given an array nums of integers, the running sum is calculated as follows: nums[i] is updated 
* by adding the value of the previous element, i.e., nums[i] += nums[i - 1]. 
* Implement a function runningSum to calculate the running sum for a given array.
 */
public class RunningSumArray{
    public static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i -1];
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {1,1,1,1};
        // int[] nums = {1,2,3,4}; //{1,3,5,10}
        runningSum(nums);
    }
}