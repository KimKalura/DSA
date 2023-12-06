package lc.string;

public class permutations {
    //Given a string S. The task is to print all unique permutations of the given string in lexicographically sorted order.

    //TC:O(N!) - N este nr de el din array; nr de permutari pt N elemente ste N!
    //SC: O(N) -
    static void permutation(char[] ar, int fi) {
        if (fi == ar.length - 1) {
            System.out.println(ar);
            return;
        }
        for (int i = fi; i < ar.length; i++) {
            swap(ar, i, fi);
            permutation(ar, fi + 1);
            swap(ar, i, fi); // înapoi pentru a restabili array-ul original
        }
    }

    static void swap(char[] ar, int i, int fi) {
        char temp = ar[i];
        ar[i] = ar[fi];
        ar[fi] = temp;
    }

    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C'};
        //char[] arr = {'A', 'B', 'S','G'};
        permutation(arr, 0);
    }


}
