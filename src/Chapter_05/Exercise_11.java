package Chapter_05;

/**
 * (Find numbers divisible by 5 or 6, but not both) Write a program that displays
 all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not
 both. Numbers are separated by exactly one space.
 */
public class Exercise_11 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
        int count = 0;

        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                count++;
                if (count % NUMBERS_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
