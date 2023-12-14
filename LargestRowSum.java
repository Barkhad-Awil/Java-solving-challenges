/*
Exercise 2.9: write a program that create a 2D array and initilise it's elements randomly.
calculate Which row has the largest sum? Use variables maxRow and indexOfMaxRow to track
the largest sum and index of the row. For each row, compute its sum and update maxRow
and indexOfMaxRow if the new sum is greater.
 */

public class LargestRowSum{
    
    private int[][] array;
    public LargestRowSum(){
        array = new int[8][8];
    }

   public int[][] randomValue(int[]...matrix){
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
        return matrix;
   }

          
    public int largestRowSum(LargestRowSum obj){
        int[][] matrix = randomValue(obj.array);
                
        int maxRow = 0; 
        int indexOfMaxRow = 0;             
            for(int col = 0; col < matrix[0].length; col++){
                    maxRow += matrix[0][col];
            }

            for(int row = 1; row < matrix.length; row++){
                int totalOfThisRow = 0;
                for(int col = 0; col < matrix[row].length; col++){
                    totalOfThisRow += matrix[row][col];

                    if(totalOfThisRow > maxRow){
                        maxRow = totalOfThisRow;
                        indexOfMaxRow = row;
                    }
                }
            }
            System.out.println("The index is: "+ indexOfMaxRow);
            return maxRow;
        }


    public static void main(String[] args){
        LargestRowSum obj = new LargestRowSum();
        System.out.println("biggest row: " + obj.largestRowSum(obj));
    }
}