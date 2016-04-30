package Chapter_06;

/**
 * (Display patterns) Write a method to display a pattern as follows:
 1
 2 1
 3 2 1
 ...
 n n-1 ... 3 2 1
 The method header is
 public static void displayPattern(int n)
 */
public class Exercise_06 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter line number: ");
        int lineNumber = input.nextInt();

        displayPattern(lineNumber);
    }

    public static void displayPattern(int n) {
        for (int row = 1; row <= n; row++) {

            for (int i = row; i < n; i++)
                System.out.print("  ");

            for (int i = row; i >= 1; i--)
                System.out.print(" " + i);

            System.out.println();
        }
    }

}
