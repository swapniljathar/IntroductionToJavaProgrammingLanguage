package Chapter_07;

import java.util.Scanner;

/**
 *(Eliminate duplicates) Write a method that returns a new array by eliminating the
 duplicate values in the array using the following method header:
 public static int[] eliminateDuplicates(int[] list)
 Write a test program that reads in ten integers, invokes the method, and displays
 the result.
 */
public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten number: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        int[] distinctNumbers = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are:");
        for (int e: distinctNumbers) {
            if (e > 0)
                System.out.print(" " + e);
        }
        System.out.println();
    }
    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctList = new int[list.length];
        int i = 0;
        for (int e: list) {
            if (linearSearch(distinctList, e) == -1) {
                distinctList[i] = e;
                i++;
            }
        }
        return distinctList;
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }
}
