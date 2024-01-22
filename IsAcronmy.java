import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Excercise 5.5:
 * Given an array of strings words and a string s, determine if s is an acronym of words.
 * The string s is considered an acronym of words if it can be formed by concatenating
 * the first character of each string in words in order. For example, "ab" can be formed from ["apple", "banana"],
 * but it can't be formed from ["bear", "aardvark"].
 * Return true if s is an acronym of words, and false otherwise.
 */
class Solution {

  public boolean isAcronym(List<String> words, String s) {
    StringBuilder str = new StringBuilder();

    for (int i = 0; i < words.size(); i++) str.append(words.get(i).charAt(0));

    return str.toString().equals(s);
  }
}

public class IsAcronmy {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] str = { "alice", "bob", "charlie" };
    String s = "abc";
    List<String> list = new ArrayList<>(Arrays.asList(str));
    boolean acronym = solution.isAcronym(list, s);
    System.out.println(acronym);
  }
}
