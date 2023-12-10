
/*
 *  Exercise 2.6: There's a great war between the even and odd numbers. 
 * Many numbers already lost their lives in this war and it's your task to end this. 
 * You have to determine which group sums larger: the evens, or the odds. 
 * The larger group wins.Create a function that takes an array of integers, 
 * sums the even and odd numbers separately, then returns the difference between 
 * the sum of the even and odd numbers
 */

public class WarOfWords{
    public static int warOfNumbers(int[] arr){
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 0; i< arr.length; i++){
            int currElem = arr[i];
            if(currElem % 2 == 0){
                sumEven += currElem;
            } else {
                sumOdd += currElem;
            }
        }

        if(sumEven > sumOdd){
            System.out.println("Even numbers are bigger");
            return sumEven - sumOdd;
        } else {
            System.out.println("Odd numbers are bigger");
            return sumOdd - sumEven;
        }
    }
    public static void main(String[] args) {
        int[] array = {2,8,7,5};
        int value = warOfNumbers(array);
        System.out.println(value);
    }
}