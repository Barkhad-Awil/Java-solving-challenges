/*
 * Question 4.9:
 * You are given a string s and an integer array indices of the same length. 
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 * Return the shuffled string.

 */

public class ShuffleString {
    public static String restoreString(String str, int[] indices){
        char[] result = new char[str.length()];
        for(int i = 0;i < indices.length; i++){
            result[indices[0]] = str.charAt(i);
        }
        return result.toString();
    }

    public static void main(String...args){
        int[] indices = {4,5,6,7,0,2,1,3};
        String str = "codeleet";
        String res = restoreString(str, indices);
        System.out.println(res);
    }
}
