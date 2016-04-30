package Chapter_06;

/**
 * (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
 isPrime(int number) method for testing whether a number is prime. Use this
 method to find the number of prime numbers less than 10000.
 */
public class Exercise_10 {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 2; number < 10000; number++)
            if (isPrime(number))
                count++;

        System.out.println("The number of prime number < 10000 is "
                + count);
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

}
