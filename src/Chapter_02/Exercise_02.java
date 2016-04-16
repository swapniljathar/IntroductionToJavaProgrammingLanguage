package Chapter_02;

import java.util.Scanner;

/**
 * (Compute the volume of a cylinder) Write a program that reads in the radius
 and length of a cylinder and computes the area and volume using the following
 formulas:
 area = radius * radius * pi
 volume = area * length
 */
public class Exercise_02 {
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the cylinder's radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter the cylinder's length: ");
        double length = input.nextDouble();

        double area = Math.pow(radius, 2) * PI;
        double volume = area * length;

        System.out.println("Area is " + area + ". Volume is " + volume);
    }
}
