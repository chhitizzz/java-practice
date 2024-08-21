// 9. Write a program that takes a string input from the user and counts the number of vowels in the string.

import java.util.*;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.next();
        char[] c = str.toCharArray();
        int vowel = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                vowel++;
        }
        System.out.println("Vowels: " + vowel);
    }
}
