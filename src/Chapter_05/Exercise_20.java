package Chapter_05;

/**
 * (Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display all
 the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers
 per line. Numbers are separated by exactly one space.
 */
public class Exercise_20 {
    public static void main(String[] args) {
        int count = 1;
        int number = 2;
        boolean isPrime = true;

        System.out.println("The prime numbers from 2 to 1000 are \n");
        while (number <= 1000) {

            isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (count%8 == 0) {

                    System.out.println(number);
                }
                else
                    System.out.print(number + " ");

                count++;
            }
            number++;
        }
    }
}
