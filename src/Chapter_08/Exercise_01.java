package Chapter_08;

import java.util.Scanner;

/**
 * (Sum elements column by column) Write a method that returns the sum of all the
 elements in a specified column in a matrix using the following header:
 public static double sumColumn(double[][] m, int columnIndex)
 Write a test program that reads a 3-by-4 matrix and displays the sum of each
 column.
 */
public class Exercise_01 {
    public static void main(String[] args) {

        double[][] matrix = getMatrix();

        for (int col = 0; col < matrix[0].length; col++) {
            System.out.println("Sum of the elements at column " + col + " is " + sumColumn(matrix, col));
        }
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        final int ROWS = 3;
        final int COLUMNS = 4;
        double[][] m = new double[ROWS][COLUMNS];

        System.out.println("Enter a " + ROWS + "-by-" + COLUMNS + " matrix row by row:");
        for (int row = 0; row < m.length; row++)
            for (int col = 0; col < m[row].length; col++)
                m[row][col] = input.nextDouble();
        return m;
    }
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }
}
