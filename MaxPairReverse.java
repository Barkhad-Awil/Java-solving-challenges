/*
 * Problem 5.7:
 *Find Maximum Number of String Pairs
 * You are given a 0-indexed array words consisting of distinct strings.
 * The string words[i] can be paired with the string words[j] if:
 * The string words[i] is equal to the reversed string of words[j].
 * 0 <= i < j < words.length.
 * Return the maximum number of pairs that can be formed from the array words.
 * Note that each string can belong in at most one pair.
 * String[] words = {"cd","ac","dc","ca","zz"};
 */

public class MaxPairReverse {

  public static int findMaxNumberOfPairs(String[] words) {
    int count = 0;
    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if (reverseString(words[j]).equals(words[i])) {
          count++;
        }
      }
    }
    return count;
  }

  public static String reverseString(String string) {
    char[] charStr = string.toCharArray();
    int startIndex = 0;
    int endIndex = string.length() - 1;

    while (startIndex > endIndex) {
      char temp = charStr[startIndex];
      charStr[startIndex] = charStr[endIndex];
      charStr[endIndex] = temp;

      startIndex++;
      endIndex--;
    }

    return charStr.toString();
  }

  public static void main(String... args) {
    String[] words = { "cd", "ac", "dc", "ca", "zz" };
    int result = findMaxNumberOfPairs(words);
    System.out.println(result);
  }
}
