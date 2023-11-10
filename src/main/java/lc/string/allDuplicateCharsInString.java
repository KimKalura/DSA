package lc.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class allDuplicateCharsInString {
    //"test string"
    //t=3; s=2
    public static void main(String[] args) {
        printDuplicateString_hashing("test string");
        printDuplicate_sorting("test string");
    }

    //HASHING
    //ne folosim de f-ctia de Hashing
    //construim o mapa [char - int]
    //printam caracterele care au o frecventa mai mare de 1
    //TC :O(N)
    //SP :O(N)

    public static void printDuplicateString_hashing(String str) {
        Map<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (count.containsKey(str.charAt(i))) {
                count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
            } else {
                count.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> mapElement : count.entrySet()) {   // iteram prin mapa neordonata
            if (mapElement.getValue() > 1) {  //daca count este mai mare decat 1 am gasit un duplciat
                System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
            }
        }
    }

    //SORTING
    // sortam array-ul
    // parcurgem prin string-ul sortat pentru a gasi duplicate
    // daca ch urmator este acelasi ca ch curent, atunci numaram de cate ori apare acel ch
    // daca "count" este mai mare decat 1, atunci printam ch si il numaram
    //TC :O(NlogN)
    //SP :O(1)

    public static void printDuplicate_sorting(String string) {
        //sortare
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);

        //parcurgem
        for (int i = 0; i < string.length(); i++) {
            int count = 1;
            //numaram de care ori apare fiecare ch
            while (i < string.length() - 1 && sortedStr.charAt(i) == sortedStr.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                System.out.println(sortedStr.charAt(i) + " count " + count);
            }
        }
    }

}

