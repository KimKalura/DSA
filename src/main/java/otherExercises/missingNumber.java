package otherExercises;

public class missingNumber {

    // Avem un array cu numerele de la 1, la n, mai putin unul dintre ele. Cum il afli pe cel care lipseste?
    //arr[] = {1, 3, 7, 5, 6, 2}  ->  4

        // ne luam un array temp pe care il initializam cu n+1; pt a vedea ce numere sunt arr[]
        // initializam  temp[] cu 0;
        //

    //c TS -> O(N)
    public static void findMissing(int arr[], int n) {

        int temp[] = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            temp[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            temp[arr[i] - 1] = 1; //
        }

        int answer = 0; //stocheaza nr lipsa
        for (int i = 0; i <= n; i++) {
            if (temp[i] == 0) {
                answer = i + 1; //answer se actualizeaza
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 7, 5, 6, 2};
        int n = arr.length;
        System.out.println("numarul lipsa intre 1 si 7:");
        findMissing(arr, n);
    }

}
