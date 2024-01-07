package lc.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeros {

    //Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
    //Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

    //Example 1:
    //Input: arr = [1,0,2,3,0,4,5,0]
    //Output: [1,0,0,2,3,0,0,4]
    //Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

    //Example 2:
    //Input: arr = [1,2,3]
    //Output: [1,2,3]
    //Explanation: After calling your function, the input array is modified to: [1,2,3]

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.toString(arr2));

        int[] arr1 = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros2(arr1);
        System.out.println("Solutia 3: " + Arrays.toString(arr1));
    }

    //duplicam 0 acolo unde il intalnim si in acelasi timp mutam elementele la dreapta

    //sol1: brute force: TS O(N2)
    //for: daca el curent este 0, shiftam toate el la dreapta cu unu

    //sol2: O(N) -> ne folosim de Queue
    //arr = [1,0,0,2,3,0,0,4,]
    //                     ^
    //Queue = [5,0,0]
    public static void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) { //iteram de la primul el pana la ultimul
            if (arr[i] == 0) { //daca el curent este 0
                queue.add(0);
                queue.add(0);
            } else {
                queue.add(arr[i]);
            }
            Integer first = queue.poll(); //scoatem  primul el
            arr[i] = first;
        }
    }

    //sol3: TC: O(N); SC: O(1)
    //parcurgem array-ul si verificam daca el curent este 0
    //mai parcurgem o data de la sfarsit [cu j]-> el j curent va fi j-1, adica il scoatem
    //duplicam 0 [i+1=0]
    //la final incrementam i++ pt a ne muta la urmatorul index
    public static void duplicateZeros2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) { // shiftam elementele la dr incepand de la sfarsit
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0; //duplicam 0
                i++; //ne mutam la următorul index pentru a evita duplicarea zeroului din nou
            }
        }
    }
}
