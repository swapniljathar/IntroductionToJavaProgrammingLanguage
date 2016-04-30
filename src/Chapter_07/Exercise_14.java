package Chapter_07;

import java.util.Scanner;

/**
 * Created by Swapnil on 4/30/2016.(Computing gcd) Write a method that returns the gcd of an unspecified number
 of integers. The method header is specified as follows:
 public static int gcd(int... numbers)
 Write a test program that prompts the user to enter five numbers, invokes the
 method to find the gcd of these numbers, and displays the gcd.
 */
public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("Enter five numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The greatest common divisor is " + gcd(numbers));
    }

    public static int gcd(int... numbers) {
        int gcd = 1;
        boolean isDivisor;

        for (int i = 2; i < min(numbers); i++) {
            isDivisor = true;
            for (int e: numbers) {
                if (e % i != 0)
                    isDivisor = false;
            }
            if (isDivisor)
                gcd = i;
        }
        return gcd;
    }

    public static int min(int... numbers) {
        int min = numbers[0];
        for (int e: numbers) {
            if (e < min)
                min = e;
        }
        return min;
    }
}
