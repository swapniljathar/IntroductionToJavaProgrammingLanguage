package Chapter_02;

import java.util.Scanner;

/**
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 side of a hexagon and displays its area. The formula for computing the area of a
 hexagon is
 Area = (3* square root of 3 /2 )s^2
 s2, where s is the length of a side.
 */
public class Exercise_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);

        System.out.println("The area of the hexagon is " + area);
    }
}
