package Chapter_06;

/**(Conversions between Celsius and Fahrenheit) Write a class that contains the following
 two methods:
public static double celsiusToFahrenheit(double celsius)

public static double fahrenheitToCelsius(double fahrenheit)
        The formula for the conversion is:
        fahrenheit = (9.0 / 5) * celsius + 32
        celsius = (5.0 / 9) * (fahrenheit – 32)
 Write a test program that invokes these methods to display the following tables:
 Celsius Fahrenheit | Fahrenheit Celsius
 40.0 104.0 | 120.0 48.89
 39.0 102.2 | 110.0 43.33
 ...
 32.0 89.6 | 40.0 4.44
 31.0 87.8 | 30.0 -1.11
 *
 */
public class Exercise_08 {
    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
        System.out.println("---------------------------------------------");

        double celsius = 40; double fahrenheit = 120;
        for (int i = 1; i <= 10; celsius--, fahrenheit -= 10, i++) {
            System.out.println(celsius + "\t\t" + celsiusToFahrenheit(celsius) + "\t|\t" + fahrenheit + "\t\t" + fahrenheitToCelsius(fahrenheit));
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

}
