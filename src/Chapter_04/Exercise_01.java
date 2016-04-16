package Chapter_04;

import java.util.Scanner;

/**
 * (Geometry: area of a pentagon) Write a program that prompts the user to enter
 the length from the center of a pentagon to a vertex and computes the area of the
 pentagon, as shown in the following figure.

 The formula for computing the area of a pentagon is

 Area = (5 * s2)/ (4 * tan(pi/5)), where
 s is the length of a side. The side can be computed using the formula
 s = 2r sin(pi/5),
 where r is the length from the center of a pentagon to a vertex. Round up two digits
 after the decimal point.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        double s = (2 * r) * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));


        System.out.printf("The area of the pentagon is %5.2f\n", area);
    }
}
