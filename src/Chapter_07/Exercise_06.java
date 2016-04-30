package Chapter_07;

/**
 * (Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number
 n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. If a divisor
 is found, n is not prime. A more efficient approach is to check whether any of the
 prime numbers less than or equal to square root of n can divide n evenly. If not, n is prime.
 Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
 You need to use an array to store the prime numbers and later use them to check
 whether they are possible divisors for n.
 */
public class Exercise_06 {
    public static void main(String[] args) {
        final int NUM_OF_PRIMES = 50;

        int[] primeNumbers = new int[NUM_OF_PRIMES];
        int count = 0;
        int number = 2;
        boolean isPrime = true;

        System.out.println("The first 50 prime numbers are \n");

        while (count < NUM_OF_PRIMES) {
            isPrime = true;
            for (int i = 0; i < count &&
                    primeNumbers[i] <= Math.sqrt(number); i++) {
                if (number % primeNumbers[i] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers[count] = number;
                count++;
                if (count % 10 == 0) {
                    System.out.println(number);
                }
                else
                    System.out.print(number + "\t");
            }
            number++;
        }
    }
}
