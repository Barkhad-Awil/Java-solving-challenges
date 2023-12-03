/*
Exercise 2.3 Write a recursive method named oddSum that takes a positive
odd integer n and returns the sum of odd integers from 1 to n. Start with
a base case, and use temporary variables to debug your solution. You might
and it helpful to print the value of n each time oddSum is invoked.
*/


public class OddSum {

    public static int oddSum(int n){
        if( n == 1){
            return 1;
        } else {
            int result = n + oddSum(n-2);
            return result;
        }
    }
    public static void main(String[] args){
        int n =  oddSum(7);
        System.out.println(n);
    }
}
