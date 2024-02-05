import java.util.HashSet;
import java.util.Set;

/*
 * Excercise 5.6:
 * There are n rings and each ring is either red, green, or blue.
 * The rings are distributed across ten rods labeled from 0 to 9.
 * You are given a string rings of length 2n that describes the n rings that are placed onto the rods.
 * Every two characters in rings forms a color-position pair that is used to describe each ring where:
 * The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
 * The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').
 */
public class RingsAndRods {

  public static int countPoints(String s) {
    Set<Character>[] rods = new HashSet[11];

    //create a set of arrays
    for (int i = 0; i < s.length(); i++) {
      rods[i] = new HashSet<>();
    }

    //to populate the array
    for (int i = 0; i < rods.length; i++) {
      char color = s.charAt(i * 2);
      char rod = s.charAt(i * 2 + 1);

      //add elements into the hashset
      rods[Character.getNumericValue(rod)].add(color);
    }

    //count if the hashset count all the colors
    int count = 0;
    for (Set<Character> rodSet : rods) {
      if (
        rodSet.contains('R') && rodSet.contains('G') && rodSet.contains('B')
      ) {
        count++;
      }
    }

    return count;
  }

  public static void main(String... args) {
    String s = "B0B6G0R6R0R6G9";
    int count = countPoints(s);
    System.out.println(count);
  }
}
