package string;

import java.util.*;

public class Semordnilap_ForwardReversePairs {

    public static void main(String[] args) {
        //diaper, abc, test, cba, repaid
        //output : [[diaper, repaid], [abc, cba]]
        ArrayList<String> input = new ArrayList<>();
        input.add("diaper");
        input.add("abc");
        input.add("test");
        input.add("cba");
        input.add("repaid");
        System.out.println(forwardReversePairs(input));
    }

    //ne luam un set si pt primul element si ajung la reppaid ii calculez inversul si vad ca e diaper si vad ca exista deja in set, inseamna ca asta e o pereche

    //O(N*M) TS parcurgem arrayul
    //N for, lungimea arrayului; M lungimea celui mai lung cuv din reverse <(stringWord)).reverse().toString()>- in spate se parcurge
    public static ArrayList<ArrayList<String>> forwardReversePairs(ArrayList<String> strings) {
        Set<String> set = new HashSet<>(strings);
        ArrayList<ArrayList<String>> pairs = new ArrayList<>();

        for (String stringWord : strings) {//O(N)
            String reverse = new StringBuilder((stringWord)).reverse().toString();
            if (set.contains(reverse)) {
                ArrayList<String> foundPairs = new ArrayList<>();
                foundPairs.add(stringWord);
                foundPairs.add(reverse);
                pairs.add(foundPairs);
                set.remove(stringWord);
                set.remove(reverse);
            }
        }
        return pairs;
    }
}
