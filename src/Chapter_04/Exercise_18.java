package Chapter_04;

import java.util.Scanner;

/**
 * (Student major and status) Write a program that prompts the user to enter two
 characters and displays the major and status represented in the characters. The first
 character indicates the major and the second is number character 1, 2, 3, 4, which
 indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
 the following chracters are used to denote the majors:
 M: Mathematics
 C: Computer Science
 I: Information Technology
 */
public class Exercise_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String str = input.nextLine();


        char m = Character.toUpperCase(str.charAt(0));
        char s = str.charAt(1);


        switch(m)
        {
            case 'M': System.out.print("Mathematics "); break;
            case 'C': System.out.print("Computer Science "); break;
            case 'I': System.out.print("Information Technology"); break;
            default : System.out.println("Invalid input");
                System.exit(1);
        }

        switch(s)
        {
            case '1': System.out.println("Freshman"); break;
            case '2': System.out.println("Sophomore"); break;
            case '3': System.out.println("Junior"); break;
            case '4': System.out.println("Senior"); break;
            default : System.out.println("Invalid input");
        }
    }
}
