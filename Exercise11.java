// 11. Write a program that creates an 'ArrayList' of integers, removes duplicate elements, and then prints the unique elements.

import java.util.*;
import java.util.stream.Collectors;

public class Exercise11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 8, 7, 7, 9, 10, 11, 16, 5, 5, 2, 3, 2, 1));
        System.out.println("ArrayList with duplicates: " + list);

        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        Collections.sort(newList);
        System.out.println("ArrayList without duplicates: " + newList);
    }
}
