/*
 * Question 4.7:
 * Write a Java code in the provided GoalParser class that replaces specific string elements in the input string, 
 * following the mapping defined by str1 and str2 arrays.
 * 
 * Your task is to implement the `interpret` method: public static String interpret(String command)
 * 
 * The method should replace occurrences of elements in the str2 array with the corresponding elements from str1 in the input string `command`.
 * 
 * For example:
 * If command is "G()(al)", after calling interpret, it should return "Goal".
 * Consider scenarios where the replacement may affect other replacements in subsequent iterations.
 * Additionally, discuss any potential improvements or modifications you would suggest for the code to enhance readability, efficiency, or versatility.
 */

public class GoalParser { 
    public static String interpret(String command) {
            String[] str1 = {"G" , "o" ,"al"};
            String[] str2 = {"G" ,"()", "(al)"};
    
            for(int i = 0; i < str1.length; i++){
                command = command.replace(str2[i], str1[i]);
            }
            // String newStr = command.replace("()", "o");
            // newStr = newStr.replace("(al)", "al");
            // return newStr;
            return command;
    }
    public static void main(String...args){
        String command = "G()(al)";
        interpret(command);
    }
}
