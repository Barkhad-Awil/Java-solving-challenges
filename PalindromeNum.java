/*
Exercxise 2.8: Given an integer num, return true if num is a palindrome, and false otherwise. 
solve it without converting the integer to a string
Examples: 
Input: x = 121
Output: true

Input: x = -121
Output: false

Input: x = 10
Output: false
*/
 
public class PalindromeNum {

    public static boolean isPalindrome(int num){
        int originalNum = num;
        int reversedNumber = 0;
        
        while(num!=0){
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        Integer reversedValue = Integer.valueOf(reversedNumber);
        Integer originalValue = Integer.valueOf(originalNum);
        return originalValue.equals(reversedValue);
    }
    public static void main(String[] args){
        int input = -121;
        System.out.println(isPalindrome(input));
    }
}
