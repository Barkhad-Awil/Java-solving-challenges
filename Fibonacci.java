/*
    Exercise 2.1: Write a recursive method that calculates the Fibonacci value of 
    each integar number passed to the method as input, for instance if the inpur integer is 4 the output is 3.

 */

 import java.util.Scanner;
public class Fibonacci {
    public static int getFibonacci(int num){
        return (num == 0)? 0: (num == 1)? 1: getFibonacci(num-1) + getFibonacci(num - 2);
        }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number here: ");
        int decimalNumber = input.nextInt();
               
        int value = getFibonacci(decimalNumber);
        System.out.println(value);
        input.close();
    }
}
