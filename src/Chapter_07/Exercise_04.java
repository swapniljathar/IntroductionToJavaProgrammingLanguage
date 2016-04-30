package Chapter_07;

import java.util.Scanner;

/**
 * (Analyze scores) Write a program that reads an unspecified number of scores and
 determines how many scores are above or equal to the average and how many
 scores are below the average. Enter a negative number to signify the end of the
 input. Assume that the maximum number of scores is 100.
 */
public class Exercise_04 {

    public static void main(String[] args) {
        double[] scores = new double[100];
        double sum = 0;
        int count = 0;

        double item;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a new score: ");

            item = input.nextDouble();

            if (item >= 0) {
                scores[count] = item;
                sum += item;
                count++;
            }
        } while (item >= 0);

        System.out.println("count is " + count);
        double average = (sum) / count;

        int numOfAbove = 0;
        int numOfBelow = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                numOfAbove++;
            } else {
                numOfBelow++;
            }
        }
        System.out.println("Average is " + average);
        System.out.println("Number of scores above or equal to the average "
                + numOfAbove);
        System.out.println("Number of scores below the average " + numOfBelow);
    }

}
