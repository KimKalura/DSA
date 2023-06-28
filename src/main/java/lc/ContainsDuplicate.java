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
