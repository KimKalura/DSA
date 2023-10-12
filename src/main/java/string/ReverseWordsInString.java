package string;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseWordsInString {

    //input: I am the best!
    //output: best! the am I
    public static void main(String[] args) {
        System.out.println(reverseWords("I am the best!"));
    }


    //sol1
    //split dupa space, introducem intr-un array cuvintele splituite,
    // parcurgem lista de la coada la cap si construim un nou string rezultat
    //O(N) - N lungimea string-ului, O(N)S

    //sol2
    //parcurgem string-ul
    //atat timp cat e diferit de spatiu, construim cuvintele si le bagam intr-o lista
    //inversam lista

    public static String reverseWords(String string) {
        ArrayList<String> words = new ArrayList<>();
        int startOfWord = 0;
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (character == ' ') {
                words.add(string.substring(startOfWord, i));
                startOfWord = i + 1;
            }
        }
        words.add(string.substring(startOfWord));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    //cum inversam o lista?
    //sol1: parcurgem de la coada la cap
    //sol2: cu 2 pointer, unul la inceput, unul la sfarsit - cel de la inceput il increteam, cel de la sf il decrementam pana cand ajungem la [j<i]
    //inversam elementele de la i si j la fiecare pas [met cu pah]


    //**
    //Write a function that reverses a string. The input string is given as an array of characters s.
    //You must do this by modifying the input array in-place with O(1) extra memory.
    //Input: s = ["h","e","l","l","o"]
    //Output: ["o","l","l","e","h"]
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap characters at the left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            // Move the pointers inward
            left++;
            right--;
        }
    }

}
