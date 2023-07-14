package otherExercises;

import java.util.HashMap;

public class repeatedChar {

    // Gaseste caracterul care se repeta de cele mai multe ori intr-un string
        //cream mapa pentru a stoca frecventa fiecarui caracter
        //adaugam fiecare element in mapa pt a vedea de cate ori apare

    public static char getMaxOccurringChar(String string) { //int-> ASCII
        HashMap<Character, Integer> charMap = new HashMap<>();

        char answer = 0;
        int count = 0;

        for(int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            charMap.put(character, charMap.getOrDefault(character, 0) + 1);

            // actualizam answer si count
            if(count < charMap.get(character)) {
                answer = character;
                count = charMap.get(character);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String string = "L'Shana Haba'ah B'Yerushalayim";
        System.out.println("caracterul care apare de cele mai multe ori: " + getMaxOccurringChar(string));
    }

}
