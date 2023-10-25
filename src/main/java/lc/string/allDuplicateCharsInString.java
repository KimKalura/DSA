package lc.string;

import java.util.HashMap;
import java.util.Map;

public class allDuplicateCharsInString {
    //"test string"
    //t=3; s=2
    public static void main(String[] args) {
        printDuplicateString("test string");
    }

    //ne folosim de f-ctia de Hashing
    //construim o mapa [char - int]
    //printam caracterele care au o frecventa mai mare de 1
    //TC :O(N)
    //SP :O(1)
    public static void printDuplicateString(String str) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (count.containsKey(str.charAt(i))) {
                count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
            } else {
                count.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> mapElement : count.entrySet()) {   //iterating through the unordered map
            if (mapElement.getValue() > 1) {  //if the count of characters is greater than 1 then duplicate found
                System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
            }
        }
    }


}

