package lc.array;

import java.util.ArrayList;
import java.util.List;

public class TrappingWater {

    //Given an array arr[] of N non-negative integers representing the height of blocks.
    //If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season.

    public static void main(String[] args) {

        List<Integer> arr = List.of(1,0,2,1,0,1,3,2,1,0,1);//1+1+2+1+1
        List<Integer> arr2 = List.of(3,0,0,2,0,4);//3+3+1+3=10

        System.out.println(trappingWater(arr));
        System.out.println(trappingWater(arr2));

    }

    //TC: O(N2); SC: O(N)
    public static int trappingWater(List<Integer> arr) {
        //parcurgem fiecare element din array de la poz 1 la poz length-2 inclusiv
        //pentru fiecare element:
            //calculam maximul din stanga lui
            //calculam maximul din dreapta lui
            //calculam minimul dintre cele 2 maxime
        //facem diferenta dintre minim si elementul curent
        //daca este mai mare decat 0, adunam la o suma

        int sum = 0;
        for (int i = 1; i < arr.size() - 1; i++) {
            int leftMax = getMaxOnInterval(0, i - 1, arr);
            int rightMax = getMaxOnInterval(i + 1, arr.size() - 1, arr);
            int minLeftRight = Math.min(leftMax, rightMax);

            if (minLeftRight - arr.get(i) > 0) {
                sum += minLeftRight - arr.get(i);
            }
        }
        return sum;
    }

    public static int getMaxOnInterval(int left, int right, List<Integer> arr) {
        int max = arr.get(left);
        for (int i = left; i <= right; i++) {
            max = Math.max(arr.get(i), max);
        }
        return max;
    }


}
