import java.util.Scanner;

/*
 * Problem Description
 * Create a Java program to find the permutation of a given string.
 * Example Input = "ace";
Expected Output "ace aec cae cea eac eca";
 */
public class PermuteString {

  public static void permute(String str, int first, int last) {
    // base case: if f and l are the same, the string has been fully permuted
    // print the permuted string

    if (first == last) {
      System.out.println(str);
    } else {
      // recursive case: swap each character with the first character and recurse
      for (int i = first; i <= last; i++) {
        //swap the character at index first with character at index i
        str = swap(str, first, i);

        //  call permute method recursivly with f incremented by 1
        permute(str, first + 1, last);

        //undo the swap for backtracking
        str = swap(str, first, i);
      }
    }
  }

  public static String swap(String str, int i, int j) {
    char[] chars = str.toCharArray();
    char temp = chars[i];
    chars[i] = chars[j];
    chars[j] = temp;
    // once you swap return the string
    return String.valueOf(chars);
  }

  public static void main(String... args) {
    //get string from the user
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();

    //initilise the first and the last index of the str
    int first = 0;
    int last = str.length() - 1;

    //permute the string
    permute(str, first, last);

    //close the scanner
    input.close();
  }
}
