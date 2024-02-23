import java.util.Scanner;

/*
 * Challenge 6.0:
 * Create a Java program to find the second largest element in an array.
 */
public class FindSecondLargest {

  public static int findSecondLargest(int... numbers) {
    //create two variables to track the largerst and secondLargest
    int largest, secondLargest;

    //check if the which one is the largest for the first two element of the array
    if (numbers[0] > numbers[1]) {
      largest = numbers[0];
      secondLargest = numbers[1];
    } else {
      largest = numbers[1];
      secondLargest = numbers[0];
    }

    //loop the numbers array from the thir element up to the end
    for (int i = 2; i <= numbers.length - 1; i++) {
      int currElem = numbers[i];
      if (currElem > largest) {
        secondLargest = largest;
        largest = currElem;
      } else if (currElem < largest && currElem > secondLargest) {
        secondLargest = currElem;
      }
    }

    return secondLargest;
  }

  public static void main(String... args) {
    //create an array of integers
    int size = 5;
    int[] numbers = new int[size];

    //get elements of the array from the user
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
      numbers[i] = input.nextInt();
    }

    //get the second largest element of the array
    int result = findSecondLargest(numbers);

    //print the value
    System.out.println(result);
  }
}
