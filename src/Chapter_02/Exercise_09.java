package Chapter_02;

import java.util.Scanner;

/**
 * (Physics: acceleration) Average acceleration is defined as the change of velocity
 divided by the time taken to make the change, as shown in the following formula:
 a = (v1 - v0 )/t
 Write a program that prompts the user to enter the starting velocity v0 in meters/
 second, the ending velocity v1 in meters/second, and the time span t in seconds,
 and displays the average acceleration.
 */
public class Exercise_09 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting velocity, ending velocity and time in seconds: ");
        double startingVelocity = input.nextDouble();
        double endingVelocity = input.nextDouble();
        double time = input.nextDouble();

        double acceleration = ((endingVelocity - startingVelocity) / time);

        System.out.println("Acceleration: " + acceleration);
    }
}
