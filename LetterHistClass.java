/*
    Exercise 1.5 Write a method called letterHist that takes a string as a
    parameter and returns a histogram of the letters in the string. The zeroth
    element of the histogram should contain the number of a's in the string (upper-
    and lowercase); the 25th element should contain the number of z's. Your
    solution should traverse the string only once.
*/

import java.util.Arrays;

public class LetterHistClass{
    public static boolean letterHist(String s){
        String str = s.toLowerCase();
        int[] counts = new int[26];
     
        
        for(int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            int index = letter - 'a';
            counts[index]++;
        }
        
        for(int count:counts){
            if(count!=0 && count!=2){
                return false;
            }
        }
      
        System.out.println(Arrays.toString(counts));
        return true;
    }

    public static void main(String[] args){
        String s = "mama";
        System.out.println(letterHist(s));
    }
    
}