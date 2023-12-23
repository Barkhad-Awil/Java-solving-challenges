/*
 * Question 3.6: Calculate the value of variable x after operations,
 * using the provided array of Strings.
 * Input: operations = ["--X", "X++", "X++"]
 * Output: 1
 */

public class ValOfVar {

    public static int findValueOfVariable(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            x += +(44 - operations[i].charAt(1));
        }
        return x;
    }

    public static void main(String[] args) {
        String[] operations = {"x--", "++x", "x++"};
        int value = findValueOfVariable(operations);
        System.out.println(value);
    }
}
