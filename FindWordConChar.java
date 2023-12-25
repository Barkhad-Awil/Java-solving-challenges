import java.util.ArrayList;
import java.util.List;

/*
 * Question 3.8
 * Problem Statement: Find Words Containing Character
 * You are given a Java class FindWordConChar with a method findWordsContainCharacter. 
 * The method takes two parameters:
 * List<String> words: A list of words.
 * char x: A character.
 * The method is designed to find the indices of words in the list that contain the specified character x. 
 * The indices are then stored in a list and returned as the result.
 */

public class FindWordConChar{
    public static List<Integer> findWordsContainCharacter(List<String> words, char x){
        List<Integer> ans = new ArrayList<>();
        int len = words.size();
        for(int i = 0; i < len; i++){
            for(char j: words.get(i).toCharArray()){
                if(j == x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans; 
    }

    public static void main(String[] args){
        List<String> words = new ArrayList<>();
        words.add("Leet");
        words.add("code");
        char x = 'e';
        List<Integer> ans = findWordsContainCharacter(words, x);
    }
}