package Chapter_05;

/**
 * (Conversion from miles to kilometers) Write a program that displays the following
 two tables side by side:
 Miles    Kilometers   |    Kilometers Miles
 1          1.609      |     20 12.430
 2          3.218      |     25 15.538
 ...
 9         14.481      |     60 37.290
 10        16.090      |     65 40.398
 */
public class Exercise_06 {
    public static void main(String[] args) {
        System.out.printf("%10s%10s    |  %10s%10s\n", "Miles", "Kilometers",
                "Kilometers", "Miles");
        System.out.println("---------------------------------------------");

        int miles = 1;
        int kilometers = 20;
        int count = 1;
        while (count <= 10) {
            System.out.printf("%10d%10.3f    |  %10d%10.3f\n", miles, miles * 1.609,
                    kilometers, kilometers / 1.609);
            miles++;
            kilometers += 5;
            count++;
        }
    }
}
