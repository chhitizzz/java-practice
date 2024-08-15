// 7. Write a program to reverse the elements of an array.

import java.util.*;

public class Exercise7 {
    static void reverse(Integer inti[]) {
        Collections.reverse(Arrays.asList(inti));
        System.out.println(Arrays.asList(inti));
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        reverse(intArray);
    }
}
