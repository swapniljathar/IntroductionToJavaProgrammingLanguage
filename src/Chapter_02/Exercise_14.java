package Chapter_02;

import java.util.Scanner;

/**
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of
 health on weight. It can be calculated by taking your weight in kilograms and
 dividing by the square of your height in meters. Write a program that prompts the
 user to enter a weight in pounds and height in inches and displays the BMI. Note
 that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 */
public class Exercise_14 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        double weight = input.nextDouble();


        System.out.print("Enter the height in inches: ");
        double height = input.nextDouble();

        weight = weight * KILOGRAMS_PER_POUND;
        height = height * METERS_PER_INCH;

        double BMI = weight / Math.pow(height, 2);

        System.out.println("BMI is " + BMI);
    }
}
