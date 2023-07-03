package lc;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    //Given an integer array nums, return true if any value appears at least twice in the array, and
    // return false if every element is distinct.

    //Input: nums = [1,2,3,1]
    //Output: true
    //Input: nums = [1,2,3,4]
    //Output: false


    public static boolean containsDuplicate(int[] nums) {

        //brute force,CT O(N2)???; compar fiecare element cu celelalte
        /*for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == element) {
                    return true;
                }
            }
        }
        return false;*/

        //Sol 1
         /*HashSet<Integer> set = new HashSet<>();
         for (int num : nums) {
             if (set.contains(num)) {
                 return true;
             }
             set.add(num);
         }
         return false;*/


        //Sol2
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
