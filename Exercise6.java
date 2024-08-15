// 6. Write a program to print all the prime numbers between 1 and 100.

public class Exercise6 {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;

        String primeNumbers = "";

        for (i = 1; i <= 100; i++) {
            int counterObject = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counterObject = counterObject + 1;
                }
            }
            if (counterObject == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
            System.out.println("Prime numbers from 1 to 100 are: ");
            System.out.println(primeNumbers);
        }
    }
