import java.util.Scanner;

/*
 * Problem 6.2:
 * Create a Java program to find the minimum number of characters
 * to add in the front to make a string palindrome.
 * input = "popy";
 */
class MinimumNumberOfChars {

  public static int findMinimumNumberPalindrome(String str) {
    int count = 0;
    int i = str.length() - 1; // 5

    while (i >= 0) { //hello
      str = str.substring(0, i);
      //count the minimum characters
      count++;

      boolean result = isPalindrome(str);
      if (result) {
        break;
      }

      i--;
    }

    return count;
  }

  public static boolean isPalindrome(String text) {
    int size = text.length();
    for (int i = 0; i < size / 2; i++) {
      if (text.charAt(i) != text.charAt(size - 1 - i)) {
        return false;
      }
    }

    return true;
  }

  public static void main(String... args) {
    //get value from the user
    Scanner input = new Scanner(System.in);
    String text = input.nextLine();

    //call the method that find the minimum character to make string palindrome
    int minimumNumber = findMinimumNumberPalindrome(text);

    //print minimum number
    System.out.println(minimumNumber);
  }
}
