/*
    Exercise 1.6 Two words are anagrams if they contain the same letters and
    the same number of each letter. For example, \stop" is an anagram of \pots",
    \allen downey" is an anagram of \well annoyed", and \christopher mayeld"
    is an anagram of \hi prof the camel is dry". Write a method that takes two
    strings and checks whether they are anagrams of each other.
*/

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static boolean areAnagrams(String a, String b){
        String str1 = a.replaceAll("\\s", "").toLowerCase();
        String str2 = b.replaceAll("\\s" , "").toLowerCase();

        if(str1.length() != str2.length()){
                return false;
        }

        //create a map to store characters in the string and to track their counts
        Map<Character, Integer> charCount = new HashMap<>();
        for(char ch: str1.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }

        //check if the second character has same count with the first string
        for(char ch: str2.toCharArray()){
            int count = charCount.getOrDefault(ch,0);
            if(count == 0){
                return false;
            }

            // Decrease the count for the matched character
            charCount.put(ch, count - 1);
        }
       
        //Check if the count value is not equal to zero
        for(int count: charCount.values()){
                if(count != 0){
                    System.out.println("Not anagrams");
                    System.out.println(count);
                    return false;
                }
        }

        return true;    
    }

    public static void main(String[] args){
        String str1 = "stop";
        String str2 = "pots"; 
        System.out.println("Str1 and Str2 words are anagrams: " + areAnagrams(str1, str2));
  
    }
    
}
