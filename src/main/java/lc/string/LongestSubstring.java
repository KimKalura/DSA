package lc.string;

import java.util.HashSet;

public class LongestSubstring {

    // longest substring without repeating characters

    //string = "abcabcbb"
    //output:3
    //explanation: the answer is "abc", with the length of 3

    //string="bbbbb"
    //output: 1
    //expl: "b"

    //string="pwwkew"
    //output: 3
    //expl: "wke"

    //TC: O(N)
    //SC: O(1)
    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet<>();// retine ch distincte
        while (j < s.length()) {
            if (!hashSet.contains(s.charAt(j))) {
                hashSet.add(s.charAt(j));
                j++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }
}
