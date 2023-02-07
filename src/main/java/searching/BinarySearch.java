package searching;

import java.lang.reflect.Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(a, 8, 0, a.length - 1)); //R: indexul 6

    }

    //O(log(N) T, O(1) S -> pt ca nu folosim alta memorie auxiliara(pt S)
    public static int binarySearch(int[] array, int target, int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target == array[middle]) {
                return middle;
            } else if (target < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
