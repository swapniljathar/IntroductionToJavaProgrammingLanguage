package Chapter_05;

/**
 * (Display numbers in a pyramid pattern) Write a nested for loop that prints the
 following output:
                                  1
                                1 2 1
                              1 2 4 2 1
                            1 2 4 8 4 2 1
                         1 2 4 8 16 8 4 2 1
                      1 2 4 8 16 32 16 8 4 2 1
                   1 2 4 8 16 32 64 32 16 8 4 2 1
               1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
 */
public class Exercise_19 {
    public static void main(String[] args) {
        int startRight = 0,
                endSpace = 7;
        for (int row = 1; row <= 128; row += row) {
            for (int startSpace = 0; startSpace < endSpace; startSpace++) {
                System.out.print("    ");
            }
            for (int l = 1; l <= row; l += l) {
                System.out.printf("%4d", (l));
            }
            for (int r = startRight; r > 0 ; r /= 2 ) {
                System.out.printf("%4d", (r));
            }
            System.out.println();
            endSpace--;
            startRight = row;
        }
    }
}
