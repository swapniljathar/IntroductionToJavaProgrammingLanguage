package Chapter_07;

import java.util.Scanner;

/**
 * (Find the index of the smallest element) Write a method that returns the index of
 the smallest element in an array of integers. If the number of such elements is
 greater than 1, return the smallest index. Use the following header:
 public static int indexOfSmallestElement(double[] array)
 Write a test program that prompts the user to enter ten numbers, invokes this
 method to return the index of the smallest element, and displays the index.
 */
public class Exercise_10 {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();
        System.out.println("The index of the min is " +
                indexOfSmallestElement(numbers));
    }
    public static int indexOfSmallestElement(double[] list) {
        double min = list[0];
        int minIndex = 0;

        for (int i = 1; i < list.length; i++)
            if (min > list[i]) {
                min = list[i];
                minIndex = i;
            }

        return minIndex;
    }
}
