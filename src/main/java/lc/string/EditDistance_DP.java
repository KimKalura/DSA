package lc.string;

public class EditDistance_DP {

    //Given two strings s and t. Return the minimum number of operations required to convert s to t.
    //The possible operations are permitted:
    // 1. Insert a character at any position of the string.
    // 2. Remove any character from the string.
    // 3. Replace any character from the string with any other character.

    //EXAPLES:

    //Input :
    //s = "geek", t = "gesek"
    //Output: 1
    //Explanation: One operation is required
    //inserting 's' between two 'e's of s.

    //Input :
    //s = "gfg", t = "gfg"
    //Output:
    //0
    //Explanation: Both strings are same.


    //**pentru exemplul geek-gesek : parcurgem si inseram
    // parcurgem cu 2 pointeri de la sfasit
    // si verificam daca caracterele din t sunt egale cu cele din s
    // acolo unde nu este egal inseram

    //**pentru exemplul dog-dig : parcurgem, stergem, inseram
    //*trebuie sa acoperim si cazul s1 = dog, s2 = dig
    //parcurgem ambele stringuri
    //stergem din din s char 'o',
    //si inseram 'i'
    //-->1 operatie de schimbare

    //**pentru exemplul create-cats > parcurgem, stergem, inseram
    //* al caz pe care trebuie sa il acoperim s1=CREATE, s2=CATS
    // CREATE -> stergem r,e si e [pe care il inlocuim cu S]
    //-->3 operatii de schimbare

    //TC:O(m*n);
    //SC:O(m*n);
    public static int editDistance(String a, String b) {
        int m = a.length();
        int n = b.length();

        int dp[][] = new int[m + 1][n + 1]; //matrice de 2 dim: m+1 si n+1

        //caz de baza:
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else { //daca nu se potrivesc
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]); //se alege minimul din cele 3 op si adaugam +1
                    //min de sus, min de la stg, min diagonal   [! insert, remove, replace !]
                }
            }
        }
        return dp[m][n];//returnam ce este in ultima celula din matrix
    }

    public static void main(String[] args) {
        System.out.println(editDistance("dog", "dig"));
        System.out.println(editDistance("gfg", "gfg"));
        System.out.println(editDistance("create", "cats"));
        System.out.println(editDistance("geek", "gesek"));
        System.out.println(editDistance("010", "101"));
    }
}
