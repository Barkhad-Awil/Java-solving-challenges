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
