package lc.string;

import java.util.HashMap;

public class ShuffleString {
    //Check if a string is a valid shuffle of two distinct strings
    //1XY2 is a valid shuffle of XY and 12
    //Y1X2 is a valid shuffle of XY and 12
    //Y21XX is not a valid shuffle of XY and 12

    //Input: str1 = BA, str2 = XY, shuffle = XYAB
    //Output: YES

    //Input: str1 = BA, str2 = XY, shuffle = XUMB
    //Output: NO

    //stocam nr fiecarui caracter din ambele stringuri in HashMap
    //iteram prin Stringul shuffle. Si pt fiecare ch intalnit din shaffle il cautam in hashMap
        //daca ch este gasit, continuam iterarea pana ajungem la sfarsitul substringului si facem acelasi lucru cu fiecare ch si decrementam fiecare ch pe care il intalnim.
        //daca niciun ch nu este gasit in hashMao, returnam false

    //TC+SC: O(N)
    public static boolean validShuffle(String str1, String str2, String shuffle) {
        int n1 = str1.length();
        int n2 = str2.length();
        int n = shuffle.length();

        if (n != n1 + n2) {
            return false;
        }

        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < n1; i++) {
            freq.put(str1.charAt(i), freq.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < n2; i++) {
            freq.put(str2.charAt(i), freq.getOrDefault(str2.charAt(i), 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (freq.containsKey(shuffle.charAt(i))) {
                freq.put(shuffle.charAt(i), freq.get(shuffle.charAt(i)) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "BA";
        String str2 = "XY";
        String shuffle = "ABYX";

        /*String str1 = "XY";
        String str2 = "12";
        String shuffle = "Y1X2";*/

        if (validShuffle(str1, str2, shuffle)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
