/*
 * Question 3.7: Write a Java program that defines a class named LongestCommonPrefix. 
 * The class should contain a method named findLongestCommonPrefix that takes an array of strings as input 
 * and returns the longest common prefix among the strings.
 */

public class LongestCommonPrefix {
    public static String findLongestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }

        int minLength = Integer.MAX_VALUE;
        for(String str:strs){
            minLength = Math.min(minLength, str.length());
        }

        StringBuffer result = new StringBuffer();

        for(int i = 0; i < minLength; i++){
            char currChar = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++){
                if(strs[j].charAt(i) != currChar){
                    return result.toString();
                }
            }
            result.append(currChar);
        }

        return result.toString();
    }

    public static void main(String[] args){
        String[] strs = {"flower","flown","flight"};
        String res = findLongestCommonPrefix(strs);
        System.out.println(res);
    }
}
