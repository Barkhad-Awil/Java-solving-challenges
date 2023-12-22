public class ValOfVar{

    public static int findValueOfValiable(String[] operations){
        int x = 0;
        for(int i = 0; i < operations.length; i++){
            x += + (44 - operations[i].charAt(1));
        }
        return x;
    }
    public static void main(String[] args){
        String[] operations = {"x--", "++x", "x++"};
        int value = findValueOfValiable(operations);
        System.out.println(value);
    }
}