package Chapter_07;

import java.util.Scanner;

/**
 * (Sorted?) Write the following method that returns true if the list is already sorted
 in increasing order.
 public static boolean isSorted(int[] list)
 Write a test program that prompts the user to enter a list and displays whether
 the list is sorted or not. Here is a sample run. Note that the first number in the
 input indicates the number of the elements in the list. This number is not part
 of the list.
 */
public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();

        System.out.println(
                "The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1])
                return false;
        }
        return true;
    }
}
