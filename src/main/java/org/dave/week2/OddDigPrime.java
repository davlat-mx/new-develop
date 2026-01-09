package org.dave.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OddDigPrime {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(onlyOddDigPrimes(20)));
        System.out.println(Arrays.toString(onlyOddDigPrimes(100)));

    }

    public static long[] onlyOddDigPrimes(long n) {

        long nextPrime = n + 1;

        List<Long> allPrimes = new ArrayList<>();
        List<Long> result = new ArrayList<>();

        for (long i = 3; i <=n; i++){
            boolean isPrime = true;

            for (long j = 2; j*j <= i; j++){
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && hasOnlyOddDigits(i)){
                allPrimes.add(i);
            }
        }

        result.add((long) allPrimes.toArray().length);
        result.add(Collections.max(allPrimes));

        while (true) {
            boolean isPrime = true;

            for (long j = 2; j * j <= nextPrime; j++) {
                if (nextPrime % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && hasOnlyOddDigits(nextPrime)) {
                result.add(nextPrime);
                break;
            }
            nextPrime++;
        }

        long[] array =  new long[result.size()];
        for (int i = 0; i < result.size(); i++){
            array[i] = result.get(i);
        }
        return array;
    }

    private static boolean hasOnlyOddDigits(long x) {
        while (x > 0) {
            if ((x % 10) % 2 == 0) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
}

/*
    Primes that have only odd digits are pure odd digits primes, obvious but necessary definition.
    Examples of pure odd digit primes are: 11, 13, 17, 19, 31...
    If a prime has only one even digit does not belong to pure odd digits prime,
    no matter the amount of odd digits that may have.
    Create a function, only_oddDigPrimes(), that receive a positive integer n >= 3, and output a list with three values:
    [number pure odd digit primes less than or equal to n, largest pure odd digit prime smaller than or equal to n,
    smallest pure odd digit prime larger than n]
    Let's see some cases:

    only_oddDigPrimes(20) ----> [7, 19, 31]
    ///7, beacause we have seven pure odd digit primes below 20 and are 3, 5, 7, 11, 13, 17, 19
    19, because is the nearest prime of this type to 20
    31, is the first pure odd digit that we encounter after 20///

    only_oddDigPrimes(40) ----> [9, 37, 53]
    only_oddDigPrimes(13) ----> [5, 13, 17]
 */
