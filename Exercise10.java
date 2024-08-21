// 10. Write a program that creates an 'ArrayList' of strings, adds some elements to it, and then sorts the elements in alphabetical order.

import java.util.ArrayList;
import java.util.Collections;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println("Arranging in alphabetical order: ");

        ArrayList <String> footballPlayers = new ArrayList<String>();

        // Adding elements to the ArrayList
        footballPlayers.add("Cristiano Ronaldo");
        footballPlayers.add("Lionel Messi");
        footballPlayers.add("Zinedine Zidane");
        footballPlayers.add("Kylian Mbappe");
        footballPlayers.add("Johan Cryuff");
        footballPlayers.add("Gareth Bale");
        footballPlayers.add("Wayne Rooney");
        footballPlayers.add("Andres Iniesta");
        footballPlayers.add("Yaya Toure");
        footballPlayers.add("Iker Casillas");

        // Sorting the elements of the ArrayList
        Collections.sort(footballPlayers);
        for (String i : footballPlayers) {
            System.out.println(i);
        }

    }
}
