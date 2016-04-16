package Chapter_03;

import java.util.Scanner;

/**
 * (Algebra: solve quadratic equations) The two roots of a quadratic equation
 ax2 + bx + c = 0 can be obtained using the following formula:
 r1 = -b + (square root(b2 - 4ac)/2a) and r2 = -b - (square root(b2 - 4ac)/2a)

 b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
 equation has two real roots. If it is zero, the equation has one root. If it is negative,
 the equation has no real roots.
 Write a program that prompts the user to enter values for a, b, and c and displays
 the result based on the discriminant. If the discriminant is positive, display two
 roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 has no real roots”.
 Note that you can use Math.pow(x, 0.5) to compute 2x.
 */
public class Exercise_01 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the value of 'a': ");
        double a = input.nextFloat();
        System.out.println("Enter the value of 'b': ");
        double b = input.nextFloat();
        System.out.println("Enter the value of 'c': ");
        double c = input.nextFloat();

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if(discriminant > 0)
        {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has two roots: " + root1 + " and " + root2);
        }
        else if(discriminant == 0)
            System.out.println("The equation has one root: " + (-b / 2 * a));
        else
            System.out.println("The equation has no real roots");
    }
}
