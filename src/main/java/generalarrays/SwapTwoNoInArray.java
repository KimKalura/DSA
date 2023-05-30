package generalarrays;

import java.util.Arrays;

public class SwapTwoNoInArray {

    public static void main(String[] args) {
        //output:
        //Array = [1, 2, 3, 4, 5]
        //After swaping two number in the array are :
        //Array = [1, 2, 3, 5, 4]*/

        int[] array = {1,2,3,4,5};

        System.out.println("Array = " + Arrays.toString(array));
        swapAll(array, 3, 4);
        System.out.println("After swaping two number in the array:");
        System.out.println("Array = " + Arrays.toString(array));

    }

    public static void swapAll(int[]array, int i, int j) {
        for(int count=0; count<array.length; count++) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

