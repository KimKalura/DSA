package sorting;

import javax.naming.PartialResultException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("ex1");

        int[] arr = {3, 8, 4, 7, 1, 9};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println(" ");
        System.out.println("ex2");

        int[] array = {5, 2, 8, 4, 1};
        System.out.println("Before sorting: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("After sorting: " + Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    //ex1
    private static void swap(int[] arr, int i, int j) {
       /* int temp = arr[j];  //si le interschimbam
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;*/
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


   //ex2
    public static void bubbleSort(int[] array) {
        int n = array.length;
        int i, j, temp = 0;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}

