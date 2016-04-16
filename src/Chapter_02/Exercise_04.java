package Chapter_02;

import java.util.Scanner;

/**
 * (Convert pounds into kilograms) Write a program that converts pounds into kilograms.
 The program prompts the user to enter a number in pounds, converts it
 to kilograms, and displays the result. One pound is 0.454 kilograms.
 */
public class Exercise_04 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.454;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");

        double pounds = input.nextDouble();
        double kilograms = pounds * KILOGRAMS_PER_POUND;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
