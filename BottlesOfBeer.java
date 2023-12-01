/*
Consider the first verse of the song "99 Bottles of Beer":
99 bottles of juice on the wall,
99 bottles of juice,
Take one down, and pass it around,
98 bottles of juice on the wall.

Exercise 2.2: Write a program that displays the entire lyrics of "99 Bottles of Beer". Your
program should include a  method that does the hard part, but you
might want to write additional methods to separate other parts of the program.

*/


class Bottle{
    public static void  singSong(int numberOfBottles){
        if(numberOfBottles > 0){
            displayVerse(numberOfBottles);
            System.out.println();
            singSong(numberOfBottles -1);
        } else {
            System.out.println("No more bottles of juice on the wall, no more bottles of juice.");
            System.out.println("Go to the store and buy some more, 11 bottles of juice on the wall.");
        }
    }

    public static void displayVerse(int numberOfBottles){
        String plural  = (numberOfBottles == 1)? "" : "s";
        System.out.println(numberOfBottles + " bottle" + plural + " juice on the wall, " + 
        numberOfBottles + " bottle" + plural + " of Juice");
        System.out.println("Take one down and pass it around, " + (numberOfBottles - 1 == 0 ? "no more" : numberOfBottles - 1) + " bottle" + plural + " of juice on the wall.");
    }
    public static void main(String[] args){
        int numberOfBottles = 99;
        singSong(numberOfBottles);
    }
}

