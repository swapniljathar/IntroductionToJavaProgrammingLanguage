package Chapter_04;

import java.util.Scanner;

/**
 * (Geometry: area of a hexagon) The area of a hexagon can be computed using the
 following formula (s is the length of a side):

 Area = ( 6* s^2)/ ( 4 * tan(pi/6))

 Write a program that prompts the user to enter the side of a hexagon and displays
 its area. Here is a sample run:
 */
public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The are of the hexagon is %4.2f\n", area);
    }
}
