package lc.string;

import java.util.Arrays;

public class TransformString {

    //Given two strings A and B. Find the minimum number of steps required to transform string A into string B.
    // The only allowed operation for the transformation is selecting a character from string A and inserting it in the beginning of string A.

    //Input:
    //A = "GeeksForGeeks"
    //B = "ForGeeksGeeks"
    //Output: 3
    //Explanation: The conversion can take
    //place in 3 operations:
    //Pick 'r' and place it at the front.
    //A = "rGeeksFoGeeks"
    //Pick 'o' and place it at the front.
    //A = "orGeeksFGeeks"
    //Pick 'F' and place it at the front.
    //A = "ForGeeksGeeks"


    //lungimea celor 2 stringuri trebuie sa fie egala


    //TC- O(N)-> lungimea lui A si B;  SC- O(1)
    public static int minOps(String A, String B) {
        // verificam daca este posibila conversia sau nu
        if (A.length() != B.length()) {
            return -1;
        }

        int i = 0; //cu i iteram  prin A de la dr la stg
        int j = 0; //cu i iteram  prin B de la dr la stg
        int res = 0; //număra operațiile necesare
        int[] count = new int[256]; //ține evidența numărului de apariții ale fiecărui caracter din ambele string-uri. Se realizează asta prin parcurgerea ambelor string-uri și actualizarea string-ului count în funcție de caracterele găsite.

        // numaram caracterele din A
        // scadem count pentru fiecare caracter din B
        for (i = 0; i < A.length(); i++) {
            count[A.charAt(i)]++;
            count[B.charAt(i)]--;
        }

        // verificam daca toate caracterele din counts sunt 0
        for (i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return -1;
            }
        }

        i = A.length() - 1; // reinitializam i  si j pt parcurgerea string-urilor din dr in stg
        j = B.length() - 1;

        while (i >= 0) { //adica array-ul A nu  a fost parcurs complet
            // dacă există o nepotrivire, continuam să incrementam 'res' până când B[j] nu este găsit în A[0..i]
            if (A.charAt(i) != B.charAt(j)) {//daca caracterele nu sunt egale se incrementeaza res
                res++;
            } else {
                j--; //daca caracterele sunt egale se decrementeaza j  pt a verifica urmatoarea pozitie din string-ul B
            }
            i--;
        }
        return res; //res= nr minim de operatii necesare pt a transforma string A in B
    }

    public static void main(String[] args) {
        String A = "EACBD";
        String B = "EABCD";

        /*String A = "GeeksForGeeks";
        String B = "ForGeeksGeeks";*/

        /*String A = "anod"; //sol2
        String B = "mpad";*/

        System.out.println("Numarul de operatii minime este -> " + minOps(A, B));
    }

}


