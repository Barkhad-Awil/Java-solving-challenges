/*
 * Excersice 3.0: Create a Java program to operate on a 5x6 array of integers. 
 * Populate the array with random values. 
 * Implement a method to calculate and display the sum of each column. 
 * Utilize a loop to iterate through columns, maintaining a 'total' variable to accumulate the sum. 
 * Print the total for each column. Test the program by creating an instance of the class and invoking the necessary methods.
 */

public class ColumnTotal {
    private int[][] arr;
    public ColumnTotal(){
        arr = new int[5][6];
    }

    public int[][] createArray(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = (int)(Math.random() * 100);
            }
        }
        return matrix;
    }

    public void columnTotal(int[]...arr){
        for(int column = 0; column < arr[0].length; column++){
           int total = 0;
            for(int row = 0; row < arr.length; row++){
                total += arr[row][column];
            }
            System.out.println("Total for column " + column + ": " + total);
        }
    }
    public static void main(String[] args){
        ColumnTotal obj = new ColumnTotal();
        obj.createArray(obj.arr);
        obj.columnTotal(obj.arr);
    }
}
