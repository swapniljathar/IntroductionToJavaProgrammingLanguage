package Chapter_07;

import java.util.Scanner;

/**
 * (Print distinct numbers) Write a program that reads in ten numbers and displays
 the number of distinct numbers and the distinct numbers separated by exactly one
 space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
 Read a number and store it to an array if it is new. If the number is already in the
 array, ignore it.) After the input, the array contains the distinct numbers.
 */
public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] distinctNumbers = new int[10];
        int num;
        int count = 0;

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();


            if (isDistinct(distinctNumbers, num)) {
                distinctNumbers[count] = num;
                count++;
            }
        }
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are");
        for (int i = 0; i < distinctNumbers.length; i++) {
            if (distinctNumbers[i] > 0)
                System.out.print(" " + distinctNumbers[i]);
        }
        System.out.println();
    }
    public static boolean isDistinct(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return false;
        }
        return true;
    }
}
