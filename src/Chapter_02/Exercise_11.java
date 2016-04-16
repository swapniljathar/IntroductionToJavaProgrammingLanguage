package Chapter_02;

import java.util.Scanner;

/**
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 to enter the number of years and displays the population after the number of years.
 Use the hint in Programming Exercise 1.11 for this program. The population
 should be cast into an integer.
 */
public class Exercise_11 {
    public static void main(String[] args)
    {
        final int population = 312032486;
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of years: ");
        int years = input.nextInt();

        double nextPopulation =  (population + 28880.0 / 91 * 24 * 365 * years);

        System.out.println("Current population = " + population);
        System.out.println("In " + years + " years = " + nextPopulation);
    }
}
