/*
Consider the first verse of the song "99 Bottles of Beer":
99 bottles of beer on the wall,
99 bottles of beer,
ya' take one down, ya' pass it around,
98 bottles of beer on the wall.
Subsequent verses are identical except that the number of bottles gets smaller
by one in each verse, until the last verse:
No bottles of beer on the wall,
no bottles of beer,
ya' can't take one down, ya' can't pass it around,
'cause there are no more bottles of beer on the wall!
And then the song (finally) ends.
Exercise 2.2: Write a program that displays the entire lyrics of "99 Bottles of Beer". Your
program should include a  method that does the hard part, but you
might want to write additional methods to separate other parts of the program.
As you develop your code, test it with a small number of verses, like 3.
*/


public class BottlesOfBeer {

    public static void verse(String verse1, String verse2) {
        // Extract starting number
        int num11 = Integer.parseInt(verse1.substring(0, 2));

        int firstNum = verse1.indexOf("99");
        int lastNum = verse1.lastIndexOf("99");
        String first = verse1.substring(firstNum + 2, lastNum);
        String last = verse1.substring(lastNum + 2);

        // Extract parts of verse2
        int verse2num = verse2.indexOf("99");
        int getVerse2Num = Integer.parseInt(verse2.substring(verse2num, verse2num + 2));
        String firstPV2 = verse2.substring(0, verse2num);
        String lastPV2 = verse2.substring(verse2num + 2);

        System.out.println("Bottles of Beer Song starting...");
        for (int i = num11; i > 0; i--) {
            System.out.println(i + first + i + last);
            if (i > 1) {
                System.out.println(firstPV2 + (i - 1) + lastPV2);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String verse1 = "99 bottles of juice on the wall, 99 bottles of juice.";
        String verse2 = "Take one down and pass it around, 99 bottles of juice on the wall";
        verse(verse1, verse2);
    }
}
