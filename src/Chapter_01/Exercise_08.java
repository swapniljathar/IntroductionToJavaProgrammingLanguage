package Chapter_01;

/**
 * (Area and perimeter of a circle) Write a program that displays the area and perimeter
 of a circle that has a radius of 5.5 using the following formula:
 perimeter = 2 * radius * pi
 area = radius * radius * pi
 */
public class Exercise_08 {
    public static void main(String[] arsg){
        final double PI = 3.14;
        double radius = 5.5;
        double perimeter = (2 * radius * PI);
        double area = (radius * radius * PI);
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }
}
