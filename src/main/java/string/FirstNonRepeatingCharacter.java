package string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abcdcaf";
        System.out.println(getFirstNonRepeatingCharacter(s));
        System.out.println(getFirstNonRepeatingCharacter2(s));
    }

    //O(N2) T; O(1) S
    //verfific daca a e egal cu toate de dupa el si daca mai gasesc inca un a, nu e bun
    //apoi verific b cu toate de dupa el ; nu mai fasesc nici un b , si apoi il returnez pe b direct
    public static Integer getFirstNonRepeatingCharacter(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            boolean foundDuplicate = false;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    foundDuplicate = true;
                }
            }
            if (!foundDuplicate) {
                return i;
            }
        }
        return -1;
    }


    //O(N) T->lungimea stringului; O(M)S-> M:nr de chei; O(26)
    //cautarea cheii si inserarea in mapa nu se pune la complexitate pt ca e un hash table si are functia de hashing
    public static Integer getFirstNonRepeatingCharacter2(String s) {
        Map<Character, Integer> mapCharacters = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            if (!mapCharacters.containsKey(ch)) {
                mapCharacters.put(ch, 1);
            } else {
                mapCharacters.put(ch, mapCharacters.get(ch) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (mapCharacters.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
