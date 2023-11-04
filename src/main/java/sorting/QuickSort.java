package sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3, 8, 4, 7, 1, 9};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    //O(log N)   +part-> O(Nlog N)
    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int pivotIndex = partition(arr, begin, end);
            quickSort(arr, begin, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    //N partitionare
    public static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
       /* int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;*/
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}