// 3. Write a program that takes an integer input from the user and prints whether it is a prime number.

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num > 1) {
            for(int i =2; i < num; i++) {
                if(num % i == 0) {
                    System.out.println(num + " is not a prime number.");
                    break;
                }
                else {
                    System.out.println(num + " is a prime number.");
                    break;
                }
            }
        }
        else {
            System.out.println(num + " is not a prime number.");
        }

    }
}
