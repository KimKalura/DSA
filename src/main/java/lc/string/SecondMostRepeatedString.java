package lc.string;

import java.util.*;
import java.util.stream.Collectors;

public class SecondMostRepeatedString {

    //Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.
    //Note: No two strings are the second most repeated, there will be always a single string.

    //Input:
    //N = 6
    //arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
    //Output: bbb
    //Explanation: "bbb" is the second most occurring string with frequency 2.

    //Input:
    //N = 6
    //arr[] = {geek, for, geek, for, geek, aaa}
    //Output: for
    //Explanation: "for" is the second most occurring string with frequency 2.

    public static void main(String[] args) {
        String[] arr = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"}; ///bbb
        String[] arr2 = {"geek", "for", "geek", "for", "geek", "aaa"}; //for
        System.out.println(secFrequent(arr, 6));
        System.out.println(secFrequent(arr2, 6));

    }

    // ne folsim de o mapa k = v -> string=de cate ori apare
    // verificam daca val max < val min return val min

    //sortam, firstValue<secondValue, returnam secondValue

     public static String secFrequent(String[] arr, int n) {
         HashSet<String> visited = new HashSet<>();
         for (String value : arr) {
             if (visited.contains(value)) {
                 return value;
             }
             visited.add(value);
         }
         return null;
     }

}
