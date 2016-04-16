package Chapter_05;

/**
 * (Conversion from miles to kilometers) Write a program that displays the following
 table (note that 1 mile is 1.609 kilometers):
 Miles     Kilometers
 1           1.609
 2           3.218
 ...
 9          14.481
 10         16.090
 */
public class Exercise_04 {

    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");

        int miles = 1;
        while (miles <= 10) {
            System.out.println(miles + "\t\t" + miles * 1.609);
            miles++;
        }
    }
}
