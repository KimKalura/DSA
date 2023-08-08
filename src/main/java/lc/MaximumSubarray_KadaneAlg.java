package lc;

public class MaximumSubarray_KadaneAlg {

    //Given an integer array nums, find the subarray with the largest sum, and return its sum.
    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    //Output: 6
    //Explanation: The subarray [4,-1,2,1] has the largest sum 6.

    public static int maxSubArray(int[] nums) {
        int currentMaxSum = nums[0];
        int overallMaxSum = nums[0];
        for (int i = 1; i < nums.length; i++) { //incepem de la 1 pt ca deja am pus valoarea la index 0
            currentMaxSum = Math.max(nums[i], currentMaxSum + nums[i]);
            overallMaxSum = Math.max(currentMaxSum, overallMaxSum);
        }
        return overallMaxSum;

        //sau
        //complexity: linear Time: O(N) -> N este numărul de elemente pe care le avem în array-ul noastră nums
        //             space: constant O(1)-> nu inițializam o memorie nouă în acest algoritm
        /*int max = nums[0];
        for(int i=1; i<nums.length; i++){
            nums[i] = Math.max(nums[i], nums[i] + nums[i-1]);
            max = Math.max(max, nums[i]);
        }
        return max;*/
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

}
