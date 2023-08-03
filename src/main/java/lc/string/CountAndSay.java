package lc.string;

public class CountAndSay {

    //The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
        //countAndSay(1) = "1"
        //countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
    //To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit.
    //...Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.
    //For example, the saying and conversion for digit string "3322251":


    //Input: n = 1
    //Output: "1"
    //Explanation: This is the base case.

    //Input: n = 4
    //Output: "1211"
    //Explanation:
    //countAndSay(1) = "1"
    //countAndSay(2) = say "1" = one 1 = "11"
    //countAndSay(3) = say "11" = two 1's = "21"
    //countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"


    //folosim functia recursiva
    //pentru 4:  n=1, n=2, n=3 și, în final, n=4, rezultând „1211”


    public static String countAndSay(int n) {
        /*if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }*/

        if (n == 1) {
            return "1"; // cazul de baza
        }

        String previous = countAndSay(n - 1); // se obtine recursiv string-ul anterior " count-and-say"
        StringBuilder result = new StringBuilder();

        char currentDigit = previous.charAt(0);
        int count = 1;

        for (int i = 1; i < previous.length(); i++) {
            char digit = previous.charAt(i);
            if (digit == currentDigit) {
                count++;
            } else {
                result.append(count).append(currentDigit);
                currentDigit = digit;
                count = 1;
            }
        }
        result.append(count).append(currentDigit); // se adauga ultima secventa
        return result.toString();
    }

    public static void main(String[] args) {
        int n = 4;
        String result = countAndSay(n);
        System.out.println("Output: " + result); // Output: "1211"
    }
}
