/*
    Exercise 1.4 Write a method named arePrimeFactors that takes an integer
    n and an array of integers, and that returns true if the numbers in the array
    are all prime and their product is n.
*/

public class PrimeFactors {
    public static boolean arePrimeFactors(int[] arr) {
        boolean isPrime = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1 || (arr[i] != 2 && arr[i] % 2 == 0)) {
                isPrime = false;
                break;
            }

            for (int j = 3; j <= Math.sqrt(arr[i]); j += 2) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }

    public static boolean factorsPrime(int n, int[] arr) {
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            if (PrimeFactors.arePrimeFactors( arr)) {
                product *= arr[i];
            } else {
                return false;
            }
        }

        return product == n;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7};
        int num = 2;

        boolean isPrime = factorsPrime(num, arr);
        System.out.println(isPrime);
    }
}
