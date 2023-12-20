
/*
 * Question 3.5
 * Write a program that can guess your birthday set group, using the provided 3D array
 * Use input Scanner object for user input
 * dates in 3D array represents sets of days
 */

import java.util.Scanner;
public class GuessBirthday{
   
    public static int guessBirthday(Scanner input, int[][][] dates){
        int day = 0;
        int answer;
        for(int i = 0; i < dates.length; i++ ){
            System.out.println("is your birthday in set "+ (i+1) + "?");

            for(int j = 0; j < dates[i].length; j++){
                for(int k = 0; k < dates[i][j].length; k++){
                    System.out.printf("%4d ", dates[i][j][k]);
                }
                System.out.println();
            }

            System.out.println("Enter 0 if No, enter 1 if Yes");
            try{
                answer = input.nextInt();
            } catch(java.util.InputMismatchException e){
                System.out.println("Invalid input. Please enter 0 or 1 !");

                //consume invalid input;
                input.nextInt();

                //return -1 to indicate an error
                return -1;
            }

            if(answer == 1){
                day += dates[i][0][0];
                break;
            }
        }
       return day;
    }
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        int[][][] dates = {
             {{ 1, 3, 5, 7}, { 9, 11, 13, 15}, {17, 19, 21, 23}, {25, 27, 29, 31}},
             {{ 2, 3, 6, 7}, {10, 11, 14, 15}, {18, 19, 22, 23}, {26, 27, 30, 31}},
             {{ 4, 5, 6, 7}, {12, 13, 14, 15}, {20, 21, 22, 23}, {28, 29, 30, 31}},
             {{ 8, 9, 10, 11}, {12, 13, 14, 15}, {24, 25, 26, 27}, {28, 29, 30, 31}},
             {{16, 17, 18, 19}, {20, 21, 22, 23}, {24, 25, 26, 27}, {28, 29, 30, 31}}};

             int guessedSet = guessBirthday(input, dates);
             if(guessedSet != -1){
                System.out.println("Your birthday is in set group " + guessedSet);
             } else {
                System.out.println("Error in input please try again!.");
             }
    }
}