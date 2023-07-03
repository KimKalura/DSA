package lc;

public class MaximumProductSubarray {

    //Given an integer array nums, find a subarray that has the largest product, and return the product.
    //The test cases are generated so that the answer will fit in a 32-bit integer.
    //Input: nums = [2,3,-2,4]
    //Output: 6
    //Explanation: [2,3] has the largest product 6.

    //Input: nums = [-2,0,-1]
    //Output: 0
    //Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maxProduct = nums[0];
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // If the current number is negative, swap maxEndingHere and minEndingHere
            if (num < 0) {
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            // Update the maximum and minimum product ending at the current position
            maxEndingHere = Math.max(num, maxEndingHere * num);
            minEndingHere = Math.min(num, minEndingHere * num);

            // Update the maximum product if necessary
            maxProduct = Math.max(maxProduct, maxEndingHere);
        }

        return maxProduct;

    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int result = maxProduct(nums);
        System.out.println("Output: " + result);
    }
}
