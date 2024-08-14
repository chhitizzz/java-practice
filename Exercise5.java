// 5. Write a program that prints the multiplication tables of a given number up to 10.

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        // 1. Using for loop
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sb.nextInt();

        System.out.println("The multiplication table of " + num + " is:");

        for(int i = 1; i <= 10; ++i) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

        System.out.println("");

        // 2. Using while loop
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sd.nextInt();
        int temp = 1;

        System.out.println("The multiplication table of " + number + " is:");

        while (temp <= 10) {
            System.out.println(number + " x " + temp + " = " + number*temp);
            temp += 1;
        }
    }
}
