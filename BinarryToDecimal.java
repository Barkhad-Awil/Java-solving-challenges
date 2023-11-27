
/* 
    Exercise 1.8: Binary to Decimal Conversion
    Write a method named displayDecimal that takes a binary number represented
    as a string and returns its decimal equivalent.
    For example:
    - Calling displayDecimal("1101") should return 13.
    - Calling displayDecimal("10101") should return 21.
    Note: Ensure that the input is a valid binary string before conversion.
*/


import java.util.Scanner;

public class BinarryToDecimal{
    public static int displayDecimal(String str){
        int[] arr = new int[str.length()];

        for(int i =0; i< str.length(); i++){
            arr[i] = Character.getNumericValue(str.charAt(i));
        }

        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end --;

        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            int base = 2;
            sum += (int) (arr[i] * Math.pow(base, i));
        }

        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binnary Number (eg. 10110): ");
        String binnaryNum = scanner.nextLine();
        int value = displayDecimal(binnaryNum);
        System.out.println(value);

        scanner.close();
    }
}