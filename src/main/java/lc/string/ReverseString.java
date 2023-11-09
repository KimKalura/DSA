package lc.string;

public class ReverseString {

    //Write a function that reverses a string. The input string is given as an array of characters s.
    //You must do this by modifying the input array in-place with O(1) extra memory.

    //Example 1:
    //Input: s = ["h","e","l","l","o"]
    //Output: ["o","l","l","e","h"]

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] s2 = {'R', 'a', 'l', 'u', 'c', 'a'};
        reverseString(s);
        System.out.println("Reversed String1: " + new String(s));
        reverseString(s2);
        System.out.println("Reversed String2: " + new String(s2));
    }
}
