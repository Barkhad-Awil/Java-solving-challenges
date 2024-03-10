import java.util.Scanner;

/*
 * Problem 6.4:
 * Create a Java program to count the palindromic substrings of a given string.
 * Example Input = "aaa";
Expected Output 6 "a", "a", "a", "aa", "aa" "aaa";
 */
public class PalindromicSubstrings {

  public static int countSubStrings(String str) {
    int count = 0;
    int size = str.length();

    for (int i = 0; i < size; i++) {
      //call methoed when current character is the center of potential palindrome(odd length string)
      count += expandAroundMiddle(str, i, i);

      //call method when current charecter and second character are the center of petential palindrome(even length string)
      count += expandAroundMiddle(str, i, i + 1);
    }

    return count;
  }

  public static int expandAroundMiddle(String str, int begin, int end) {
    int count = 0;
    int sz = str.length();
    while (begin >= 0 && end < sz && str.charAt(begin) == str.charAt(end)) {
      count++;
      begin--;
      end++;
    }
    return count;
  }

  public static void main(String... args) {
    //instantiate scanner object
    Scanner input = new Scanner(System.in);

    //get string from the user
    System.out.println("Please enter a valid string: ");
    String text = input.nextLine();
    //count the palindromic substring
    int count = countSubStrings(text);

    //print the count
    System.out.println(count);

    //close the scanner
    input.close();
  }
}
