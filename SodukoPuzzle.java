
/*
 * 
Question 3.3:

You are tasked with writing a Java program to determine the validity of a Sudoku solution, 
adhering to the following rules: each row must contain numbers from 1 to 9 without repetition, 
and each column must also contain numbers from 1 to 9 without repetition.

Program Structure:

Describe the overall structure of the Java program you would write to check the validity of a Sudoku solution.
Identify the key methods and their roles in the program.
Sudoku Rules Implementation:

Explain how the program enforces the rule that each row must contain numbers from 1 to 9 without repetition.
Describe the implementation ensuring that each column must contain numbers from 1 to 9 without repetition.
Validity Check:

Clarify how the program determines whether a Sudoku solution is valid or invalid based on the specified rules.
Provide insights into the conditions or checks performed on each cell of the Sudoku grid.
Sample Sudoku Solution:

Given the following sample Sudoku solution:

java
Copy code
{5, 3, 4, 6, 7, 8, 9, 1, 2},
{6, 7, 2, 1, 9, 5, 3, 4, 8},
{1, 9, 8, 3, 4, 2, 5, 6, 7},
{8, 5, 9, 7, 6, 1, 4, 2, 3},
{4, 2, 6, 8, 5, 3, 7, 9, 1},
{7, 1, 3, 9, 2, 4, 8, 5, 6},
{9, 6, 1, 5, 3, 7, 2, 8, 4},
{2, 8, 7, 4, 1, 9, 6, 3, 5},
{3, 4, 5, 2, 8, 6, 1, 7, 9}

Walk through how the program processes this Sudoku solution and determines its validity.
Column and Row Range Check:

Explain how the program ensures that each value in a cell is within the range 1-9.
Provide insights into the part of the code responsible for checking the row and column ranges.
 */

public class SodukoPuzzle {
    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid))
                    return false;
    
        return true; // The solution is valid
    }

    public static boolean isValid(int i, int j, int[][] grid) {
        // Check whether grid[i][j] is unique in i's row
        for (int column = 0; column < 9; column++)
            if (column != j && grid[i][column] == grid[i][j])
                return false;
    
        // Check whether grid[i][j] is unique in j's column
        for (int row = 0; row < 9; row++)
            if (row != i && grid[row][j] == grid[i][j])
                return false;
    
        // Check whether grid[i][j] is unique in the 3-by-3 box
        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
            for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
                if (row != i && col != j && grid[row][col] == grid[i][j])
                    return false;
    
        return true; // The current value at grid[i][j] is valid
    }
    
    public static int[][] sodukoSolution() {
            int[][] grid = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
       
        return grid;
    }

        
    public static void main(String[] args) {
        // Read a Sudoku solution
        int[][] grid = sodukoSolution();
    
        // Check and print the validity of the solution
        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }    
}
