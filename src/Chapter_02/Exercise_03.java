package Chapter_02;

import java.util.Scanner;

/**
 *(Convert feet into meters) Write a program that reads a number in feet, converts it
 to meters, and displays the result. One foot is 0.305 meter.
 */
public class Exercise_03 {
    public static void main(String[] args) {
        final double METERS_PER_FOOT = 0.305;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");

        double feet = input.nextDouble();
        double meters = feet * METERS_PER_FOOT;

        System.out.println(feet + " feet is " + meters + " meters");
    }
}
