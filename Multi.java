import java.util.Scanner;
/*
    Exercise 2.7: Create a Java class named Multi with a single instance and three methods: 
    a constructor, userInputValue(), and randomValue(). Both userInputValue() and randomValue() 
    should use Varargs to initialize arrays. 
    For userInputValue(), employ the java.util.Scanner class to input values from the user. 
    Ensure implementation adheres to using only one instance of the Multi class.
 */

public class Multi{

    private int[][] array;

    public Multi(){
        array = new int[8][8];
    }
   public void userInputValue(int[]... arr){
        Scanner input = new Scanner(System.in);
            System.out.println("Enter "+ arr.length + " rows " + arr[0].length + " coloum");
                for(int row = 0; row < arr.length; row++){
                    for(int col = 0; col < arr[row].length; col++){
                        arr[row][col] = input.nextInt(); 
                    }
                }

        input.close();
   }

   public void randomValue(int[]...matrix){
        for(int row = 0; row<matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = (int)(Math.random()*100);
            }
        }

        for(int[] row:matrix){
            for(int element: row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
        
   }
    public static void main(String[] args){
        Multi obj = new Multi();
         // Uncomment one of the following lines based on the method you want to test
        // obj.userInputValue(obj.array);
        // obj.randomValue(obj.array);     
    }
}