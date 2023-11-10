package lc.string;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Objects;

public class IsomorphicStrings {

    //Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.

    //If the characters in str1 can be changed to get str2, then two strings, str1 and str2, are isomorphic. A character must be completely swapped out for
    // another character while maintaining the order of the characters. A character may map to itself, but no two characters may map to the same character.

    //Input:
    //str1 = aab
    //str2 = xxy
    //Output:
    //1
    //Explanation:
    //There are two different characters in aab and xxy, i.e a and b with frequency 2 and 1 respectively.

    //Input:
    //str1 = aab
    //str2 = xyz
    //Output:
    //0
    //Explanation:
    //There are two different characters in aab but there are three different charactersin xyz. So there won't be one to one mapping between str1 and str2.

    // daca lungimea stringurilor s1 si s2  nu este la fel returnam false direct

    //TC: O(n)
    public static boolean areIsomorphic(String s1, String s2) {
        //int m = s1.length();
        //int n = s2.length();

        int[] map1 = new int[256];//Folosind un array de dimensiunea 256, putem mapa fiecare caracter (reprezentat prin valoarea sa ASCII) la caracterul său corespunzător din celălalt șir.
        int[] map2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            char char1 = s1.charAt(i);
            char char2 = s2.charAt(i);

            if (map1[char1] == 0 && map2[char2] == 0) {
                map1[char1] = char2;
                map2[char2] = char1;
            } else if (map1[char1] != char2 || map2[char2] != char1) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(areIsomorphic("aab", "xxz"));
        System.out.println(areIsomorphic("aab", "xyz"));
    }
}
