package Chapter_05;

import java.util.Scanner;

/**
 * (Display pyramid) Write a program that prompts the user to enter an integer from
 1 to 15 and displays a pyramid, as shown in the following sample run:
 */
public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        for (int rows = 1; rows <= numberOfLines; rows++) {
            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int l = rows; l >= 2; l--) {
                System.out.print(l + " ");
            }
            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}
