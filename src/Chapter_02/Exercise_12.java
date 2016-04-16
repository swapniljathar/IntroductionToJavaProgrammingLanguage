package Chapter_02;

import java.util.Scanner;

/**
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off
 speed v, you can compute the minimum runway length needed for an airplane to
 take off using the following formula:
 length = v2/2a
 Write a program that prompts the user to enter v in meters/second (m/s) and the
 acceleration a in meters/second squared (m/s2), and displays the minimum runway
 length.
 */
public class Exercise_12 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the airplane's speed (m/s): ");
        double speed = input.nextDouble();
        System.out.println("Enter the airplane's acceleration (m/s^2): ");
        double acceleration = input.nextDouble();

        double runwayLength = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println("The Minimum runway length = " + runwayLength);
    }
}
