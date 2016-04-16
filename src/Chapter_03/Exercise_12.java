package Chapter_03;

import java.util.Scanner;

/**
 * (Palindrome number) Write a program that prompts the user to enter a three-digit
 integer and determines whether it is a palindrome number. A number is palindrome
 if it reads the same from right to left and from left to right. Here is a sample
 run of this program:
 */
public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int digit1 = number / 100;
        int remaining = number % 100;
        int digit3 = remaining % 10;

        System.out.println(
                number + ((digit1 == digit3) ? " is a " : " is not a ") + "palindrome");
    }
}
