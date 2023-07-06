package lc;

public class FindMinimumInRotatedSortedArray {

    //Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
    //[4,5,6,7,0,1,2] if it was rotated 4 times.
    //[0,1,2,4,5,6,7] if it was rotated 7 times.
    //Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
    //Given the sorted rotated array nums of unique elements, return the minimum element of this array.

    //Input: nums = [3,4,5,1,2]
    //Output: 1
    //Explanation: The original array was [1,2,3,4,5] rotated 3 times.

    //Input: nums = [11,13,15,17]
    //Output: 11
    //Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
    public static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;//min el este in partea dreapta
            } else {
                right = mid;//min el este in partea stg sau mijloc
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
}
