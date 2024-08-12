// 4. Write a program that takes a year as input from the user and checks if it is a leap year.

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sb.nextInt();

        if ((year % 400 == 0) && (year % 100 == 0)) {
            System.out.println(year + " is a leap year.");
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
