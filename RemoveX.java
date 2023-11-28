
/*
    Exercise 2.0: Write a recursive method that removes the character 'x' from the string 
    and then returns a clean string without "x". For instance, the string "xxabcxx" 
    will return "abc".
*/


public class RemoveX{
    public static String removeX(String str){
        return( str.isEmpty())? "string is empty" : (!str.contains("x"))? str : removeX(str.replaceFirst("x", ""));
    }

    public static void main(String[] args){
        String originalString = "xabcxxdx";
        String cleanStr = removeX(originalString);
        System.out.println(cleanStr);
    }
}