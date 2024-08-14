// 6. Write a program to print all the prime numbers between 1 and 100.

import java.util.*;
import java.util.stream.IntStream;

public class Exercise6 {
    public static void main(String[] args) {
        IntStream st = IntStream.range(1,101);
        st.forEach(System.out::println);
    }
}
