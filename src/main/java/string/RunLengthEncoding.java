package string;


import java.util.ArrayList;

public class RunLengthEncoding {
    public static void main(String[] args) {
        //AAAAAAAAAAAAABBCCCCDD2
        //9A4A2B4C2D12
        String s = "AAAAAAAAAAAAAAABBCCCCDD";
        System.out.println(rle(s));
    }
    //v1: 2 indici care incep de la inceput, contor

    //v2: parcurgere in parcurgere,
    //un indice i la inceput, iar j se parcurge toate A-urile; apoi pe i il mut pe j+1, pe primul B, si apoi incep din nou sa il mut pe j in dreapta

    //O(N) T; O(N)S ->pt ca ne luam encodedString
    public static String rle(String input) {
        ArrayList<Character> encodedString = new ArrayList<>();
        int currentLength = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1) && currentLength < 9) {
                currentLength++;
            } else {
                encodedString.add(Character.forDigit(currentLength, 10));
                encodedString.add(input.charAt(i));
                currentLength = 1;
            }
        }
        encodedString.add(Character.forDigit(currentLength, 10));
        encodedString.add(input.charAt(input.length() - 1));
        return encodedString.toString();
    }
}