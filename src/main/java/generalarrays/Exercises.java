package generalarrays;

import java.util.Arrays;
import java.util.HashSet;

public class Exercises {

    //Cea mai mica diferenta dintre 2 array-uri
    //Daca ai 2 array-uri, gaseste elementele (unul din primul si celalalt din al doilea) care sa dea diferenta minima
    //
    //Input:
    //Arr1: [-1,5,10,20,28,3]
    //Arr2: [26,134,135,15,17]
    //
    //Output: [28,26]

    //-1,3,5,10,21,28
    //15,17,24,30,13


    //CT: O(N*M) -> n=lungimea arr1, m=lungimea arr2
    //CS: O(1)-constanta

    //--hash set pt a stoca rezultatul
    //--var minDiff care va fi initializata cu maximum
    //--pentru fiecare numar din arr1 si pentru fiecare numar din arr2 fac diferenta
    //--daca diferenta < min din arr->minDifference = difference;
    public static HashSet<Integer> getMinimDifferenceBy2Numbers(int[] a, int[] b) {
        /*HashSet<Integer> c = new HashSet<>();
        int diff = 0;
        //for
        //if else*/
        HashSet<Integer> result = new HashSet<>();
        int minDifference = Integer.MAX_VALUE;

        for (int num1 : a) {
            for (int num2 : b) {
                int difference = Math.abs(num1 - num2);
                if (difference < minDifference) {
                    minDifference = difference;
                    result.clear(); // Clear->pt rezultatul de dinainte
                    result.add(num1);
                    result.add(num2);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {-1, 5, 10, 20, 28, 3};
        int[] arr2 = {26, 134, 135, 15, 17};

        HashSet<Integer> result = getMinimDifferenceBy2Numbers(arr1, arr2);
        System.out.println("Output: " + result);
    }
}
