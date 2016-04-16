package Chapter_02;

import java.util.Scanner;

/**
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
 a double value from the console, then converts it to Fahrenheit and displays the
 result. The formula for the conversion is as follows:
 fahrenheit = (9 / 5) * celsius + 32
 */
public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5 * celsius + 32);

        System.out.println(celsius + " Celsius is " + fahrenheit
                + " Fahrenheit");
    }
}
