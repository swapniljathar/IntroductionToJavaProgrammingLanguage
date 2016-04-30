package Chapter_06;

import java.util.Scanner;

/**
 * // (The MyTriangle class) Create a class named MyTriangle that contains the
 // following two methods:
 //
 // /** Return true if the sum of any two sides is
 // * greater than the third side. */
// public static boolean isValid(
// 	double side1, double side2, double side3)
//
// /** Return the area of the triangle. */
// public static double area(
// 	double side1, double side2, double side3)
//
// Write a test program that reads three sides for a triangle and computes the
// the input is valid. Otherwise, it displays that the input is invalid. The formula
// computing the area of a triangle is given in Programming Exercise 2.19.
public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println(isValid(side1, side2, side3) ?
                "The area of the triangle is " + area(side1, side2, side3) :
                "Input is invalid");
    }
    public static boolean isValid(
            double side1, double side2, double side3) {
        boolean valid =
                side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1;
        return valid;
    }
    public static double area(
            double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
