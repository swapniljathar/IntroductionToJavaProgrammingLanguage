package Chapter_05;

import java.util.Scanner;

/**
 * (Compute the greatest common divisor) Another solution for Listing 5.9 to find
 the greatest common divisor of two integers n1 and n2 is as follows: First find d
 to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
 a divisor for both n1 and n2 in this order. The first such common divisor is the
 greatest common divisor for n1 and n2. Write a program that prompts the user to
 enter two positive integers and displays the gcd.
 */
public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);

        System.out.print(
                "Enter the first number: ");
        int n1 = input.nextInt();

        System.out.print(
                "Enter the second number: ");
        int n2 = input.nextInt();

        int d = (n1 < n2) ? n1 : n2;
        for (; d >= 1; d--) {
            if ((n1 % d == 0) && (n2 % d == 0)) {
                break;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is "
                + d);
    }
}
