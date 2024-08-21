// 8. Write a program to find the second largest number in the array of integers.

import java.util.Arrays;

public class Exercise8 {
    public static int getSecondLargestInt(int[] num, int total) {
        Arrays.sort(num);
        return num[total - 2];
    }

    public static void main(String[] args) {
        int num[] = {21, 98 ,52 ,4, 11, 10, 58, 76};
        System.out.println("The second largest in the array is: " + getSecondLargestInt(num, 8));
    }
}
