import java.util.HashMap;
import java.util.Map;

/*
 * Question 5.4:
 * You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:
 * Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
 * Align the substitution table with the regular English alphabet.
 * Each letter in message is then substituted using the table.
 * Spaces ' ' are transformed to themselves.
 */
public class DecodeMessage {

  public static String decodeMessage(String key, String message) {
    key = key.toLowerCase();
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    Map<Character, Character> cipherMap = new HashMap<>();
    for (int i = 0; i < key.length(); i++) {
      if (key.charAt(i) != ' ' && !cipherMap.containsKey(key.charAt(i))) {
        cipherMap.put(key.charAt(i), alphabet[cipherMap.size()]);
      }
    }

    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < message.length(); i++) {
      char currentChar = message.charAt(i);
      if (currentChar == ' ') {
        ans.append(' ');
      } else if (cipherMap.containsKey(currentChar)) {
        ans.append(cipherMap.get(currentChar));
      }
    }

    return ans.toString();
  }

  public static void main(String... args) {
    String key = "the quick brown fox jumps over the lazy dog";
    String message = "vkbs bs t suepuv";
    String ans = decodeMessage(key, message);
    System.out.println(ans);
  }
}
