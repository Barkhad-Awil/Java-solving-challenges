import java.util.Arrays;

/*
    Exercise 1.2 The Sieve of Eratosthenes is a simple, ancient algorithm for
    finding all prime numbers up to any given limit.
    Write a method called sieve that takes an integer parameter, n, and returns
    a boolean array that indicates, for each number from 0 to n - 1, whether the
    number is prime.
*/

public class PrimeSeive {
    public static boolean[] seive(int n) {

          // a boolean array to track whether each number is prime
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        // o and 1 are not prime numbers
        isPrime[0] = isPrime[1] = false;

         // Iterate through the array and mark multiples of each prime number as non-prime
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        int num = 8;
        boolean[] primes = seive(num);
        for (int i = 0; i < num; i++) {
            System.out.print("[" + i + " : ");
            System.out.print(primes[i] + "], ");
        }
    }
}
