import java.util.List;
import java.util.ArrayList;

/*
 * Question 3.9: 
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents 
 * the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, 
 * they will have the greatest number of candies among all the kids, or false otherwise.
 */

public class GreatestNumberCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<Boolean>();
        for(int i = 0; i < candies.length; i++){
            int tempTotal = candies[i] + extraCandies;
            boolean isGreatest = true;
            for(int j = 0; j < candies.length; j++){
                if(tempTotal < candies[j]){
                    isGreatest = false;
                    break;
                }
            }

            result.add(isGreatest);
        }

        return result;
    }

    public static void main(String[] args){
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> res = kidsWithCandies(candies, extraCandies);
        System.out.println(res);
    }
}
