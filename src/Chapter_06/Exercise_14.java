package Chapter_06;

/**
 * (Estimate pi) pi can be computed using the following series:
 m(i) = 4(1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + ... + (((-1)^i + 1) / (2i - 1)))
 Write a method that returns m(i) for a given i and write a test program that displays
 the following table:
 i    m(i)
 1    4.0000
 101  3.1515
 201  3.1466
 301  3.1449
 401  3.1441
 501  3.1436
 601  3.1433
 701  3.1430
 801  3.1428
 901  3.1427
 *
 */
public class Exercise_14 {
    public static void main(String[] args) {
        System.out.printf("%-20s%-20s\n", "i", "m(i)");
        for (int i = 1; i <= 1000; i += 100)
            System.out.printf("%-20d%-20.4f\n", i, m(i));
    }

    public static double m(int i) {
        double pi = 0;
        double sign = 1;

        for (int k = 1; k <= i; k++) {
            pi += sign / (2 * k - 1.0);
            sign = -1 * sign;
        }

        return 4 * pi;
    }

}
