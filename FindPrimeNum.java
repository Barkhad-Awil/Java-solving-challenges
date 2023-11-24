
/*
TEST    
*/

import java.util.Arrays;    

public class FindPrimeNum {
    public static boolean[] sieve(int num) {
        boolean[] isPrime = new boolean[num +1];

        if (num <= 1) {
            isPrime[0] = false;
            System.out.println("The number is less than or equal to 1");
        } else if (num == 2) {
            System.out.println("The number is " + num + " and is prime");
        } else if (num % 2 == 0) {
            isPrime[0] = false;
            System.out.println("The number is even and is " + num);
        } else {
            for (int i = 3; i <= (int) Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    isPrime[0] = false;
                    System.out.println("The number is " + num + " and is not prime");
                    System.out.println("It is divisible by " + i);
                    break;
                }
            }
        }

        if (isPrime[0]) {
            System.out.println("The number is " + num + " and is prime");
        }

        return isPrime;
    }

    public static void main(String[] args) {
        boolean[] isPrime = sieve(5);
        System.out.println(Arrays.toString(isPrime));
    }
}
