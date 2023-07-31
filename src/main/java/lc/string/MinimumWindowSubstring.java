package lc.string;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    //Given two strings s and t of lengths m and n respectively, return the minimum window substring
    // of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
    //The testcases will be generated such that the answer is unique.


    //Input: s = "ADOBECODEBANC", t = "ABC"
    //Output: "BANC"
    //Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

    //Input: s = "a", t = "a"
    //Output: "a"
    //Explanation: The entire string s is the minimum window.

    //Input: s = "a", t = "aa"
    //Output: ""
    //Explanation: Both 'a's from t must be included in the window.
    //Since the largest window of s only has one 'a', return empty string.


    //folosim 2 pointeri right si left
    //mutam right pana va contine toate caracterele din t
    //apoi mutam left pana cand pana cand nu mai putem edxclude alte caractere din sirul tinta t
    


    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }

        Map<Character, Integer> targetFreqMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetFreqMap.put(c, targetFreqMap.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int minWindowLength = Integer.MAX_VALUE;
        int minWindowStart = 0;
        int remainingCharsToCover = t.length();

        for (; right < s.length(); right++) {   //while (right < s.length())
            char currentChar = s.charAt(right);
            if (targetFreqMap.containsKey(currentChar)) {
                int count = targetFreqMap.get(currentChar);
                if (count > 0) {
                    remainingCharsToCover--;
                }
                targetFreqMap.put(currentChar, count - 1);
            }

            while (remainingCharsToCover == 0) {
                if (right - left + 1 < minWindowLength) {
                    minWindowLength = right - left + 1;
                    minWindowStart = left;
                }

                char leftChar = s.charAt(left);
                if (targetFreqMap.containsKey(leftChar)) {
                    int count = targetFreqMap.get(leftChar);
                    if (count == 0) {
                        remainingCharsToCover++;
                    }
                    targetFreqMap.put(leftChar, count + 1);
                }
                left++;
            }
        }

        if (minWindowLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minWindowStart, minWindowStart + minWindowLength);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s, t);
        System.out.println("Output: " + result); // Output: "BANC"
    }
}
