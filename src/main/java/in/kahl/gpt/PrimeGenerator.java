package in.kahl.gpt;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {
    public static void main(String[] args) {
        List<Integer> primes = generateNPrimes(10);
        System.out.println("First 10 prime numbers: " + primes);
    }

    public static List<Integer> generateNPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                primes.add(num);
                count++;
            }
            num++;
        }

        return primes;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}