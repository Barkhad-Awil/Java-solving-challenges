
/*
    Exercise 1.9: Implement a Java method named displayBinary that, given an integer num, 
    returns its binary representation as a string. The method should utilize recursion 
    to calculate the binary representation. The main method demonstrates the usage 
    of this function by converting the decimal number 4 to its binary equivalent and 
    printing the result.
 */

public class DecimalToBinary{
    public static String displayBinary(int num){
        if(num == 0){
            return "0";
        } else if(num == 1){
            return "1";
        } else {
            return displayBinary(num / 2) + (num % 2);
        }   
    }

    public static void main(String[] args){
        int decimalNumber = 4;
        String binaryRepresentation = displayBinary(decimalNumber);

        int binary = Integer.parseInt(binaryRepresentation);
        System.out.println("Binary representation of " + decimalNumber + ":" + binary);
    }
}