package festine_weekly_practice.week4;

public class Task1_PrimeNum {
    public static void main(String[] args) {
        System.out.println(isPrime(33));
    }
    static boolean isPrime(int n)
    {

        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
/*
22) Numbers - Prime Number
Write a method that can check if a number is prime or not
 */

