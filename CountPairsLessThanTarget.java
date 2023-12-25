import java.util.Arrays;
import java.util.List;

/*
 * Question 4.0:
 * Given a integer array nums of length n and an integer target, 
 * return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
 */
public class CountPairsLessThanTarget{
    public static int countPairs(List<Integer> nums, int target){
        int count = 0; 
        for(int i = 0; i < nums.size(); i++)
            for(int j = i + 1; j < nums.size(); j++)
                if(i < j && nums.get(i) + nums.get(j) < target) count++;

        return count;
    }

    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(-1,1,2,3,1);
        int target = 2;
        int res = countPairs(nums, target);
        System.out.println("The number of pairs who their sum less than 2 are: " + res + " pairs");
        
    }
}