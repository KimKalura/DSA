package sorting;

import javax.naming.PartialResultException;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 8, 4, 7, 1, 9};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
       /* int temp = arr[j];  //si le interschimbam
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;*/
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
