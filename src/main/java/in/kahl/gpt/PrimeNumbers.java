package in.kahl.gpt;

public class PrimeNumbers {
    public static void generateFirstNPrimes(int n) {
        int count = 0;
        int number = 2;

        System.out.println("First " + n + " prime numbers are:");
        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to generate a different number of primes
        generateFirstNPrimes(n);
    }
}