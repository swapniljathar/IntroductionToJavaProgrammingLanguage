package Chapter_02;

import java.util.Scanner;

/**
 * (Cost of driving) Write a program that prompts the user to enter the distance to
 drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
 and displays the cost of the trip.
 */
public class Exercise_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distace: ");
        double distace = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double costOfDriving = (distace / milesPerGallon) * pricePerGallon;

        System.out.println("The cost of driving is $" + costOfDriving);
    }
}
