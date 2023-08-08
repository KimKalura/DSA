package lc.string;

public class LongestRepeatingSubsequence {

    //Given string str, find the length of the longest repeating subsequence such that it can be found twice in the given string.
    //The two identified subsequences A and B can use the same ith character from string str if and only if that ith character has different indices in A and B. For example, A = "xax" and B = "xax" then the index of first "x" must be different in the original string for A and B.
    //Example 1:
    //
    //Input:
    //str = "axxzxy"
    //Output: 2
    //Explanation:
    //The given array with indexes looks like
    //a x x z x y
    //0 1 2 3 4 5
    //
    //The longest subsequence is "xx".
    //It appears twice as explained below.
    //
    //subsequence A
    //x x
    //0 1  <-- index of subsequence A
    //------
    //1 2  <-- index of str
    //
    //
    //subsequence B
    //x x
    //0 1  <-- index of subsequence B
    //------
    //2 4  <-- index of str
    //
    //We are able to use character 'x'
    //(at index 2 in str) in both subsequences
    //as it appears on index 1 in subsequence A
    //and index 0 in subsequence B.

    //cream un array 2D-> dp[i][j] reprezintă lungimea celei mai lungi subsecvențe repetate pentru subșirurile str.substring(0, i) și str.substring(0, j)
    //iterăm prin caracterele șirului folosind două for-uri. Dacă caracterele de la pozițiile curente sunt egale (str.charAt(i - 1) == str.charAt(j - 1)) și pozițiile nu sunt aceleași (i != j), atunci putem extinde subsecvența comună anterioară, iar dp[i][j] va fi cu unul mai mult decât dp[i - 1][j - 1]
    //dacă caracterele sunt diferite, luăm maximul lungimilor subsecvențelor anterioare (dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]) )
    //stocam rezulatatul in dp[n][n]

    //TC SC :O(n2)
    public static int longestRepeatingSubsequence(String str) {
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        return dp[n][n];
    }

    public static void main(String[] args) {
        String str = "axxzxy";
        int result = longestRepeatingSubsequence(str);
        System.out.println("Output: " + result); // Output: 2
    }

}
