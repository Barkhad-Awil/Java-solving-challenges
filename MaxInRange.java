
/*
    Excersice 2.5: Write a method called maxInRange that takes an array of integers and
    two indexes, lowIndex and highIndex, and finds the maximum value
    in the array, but considering only the elements between lowIndex and
    highIndex, including both.
 */


public class MaxInRange{
    public static int maxInRange(int[] arr, int lowIndex, int highIndex){   
        if(lowIndex == highIndex){
            return arr[lowIndex];
        } else{
           int mid = (lowIndex + highIndex) /2;
           int maxLeft = maxInRange(arr, lowIndex, mid);
           int maxRight = maxInRange(arr, mid + 1, highIndex);

           return Math.max(maxLeft, maxRight);

        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int res = maxInRange(arr, 0, arr.length-1);
        System.out.println(res);
    }
}
 
