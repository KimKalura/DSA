package lc;

public class SearchInRotatedSortedArray {

    //There is an integer array nums sorted in ascending order (with distinct values).
    //Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array
    // ...is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index
    // ...3 and become [4,5,6,7,0,1,2].
    //Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

    //Input: nums = [4,5,6,7,0,1,2], target = 0
    //Output: 4

    //Input: nums = [1], target = 0
    //Output: -1


    //folosim 2 pointeri left+right pentru a defini intervalul de cautare
    //actualizăm pointerii pe baza comparației dintre nums[mid] și target
    //dacă nums[mid] este egal cu target, am găsit elementul target, așa că revenim la mijloc
    //dacă jumătatea stângă a matricei (nums[left] la nums[mid]) este sortată, verificăm dacă target se află în acel interval. Dacă este, actualizăm dreapta la mid - 1 pentru a căuta în jumătatea stângă. În caz contrar, actualizăm stânga la mid + 1 pentru a căuta în jumătatea dreaptă
    //dacă jumătatea dreaptă a matricei (nums[mid] la nums[right]) este sortată, verificăm dacă target se află în acel interval. Dacă este, actualizăm stânga la mid + 1 pentru a căuta în jumătatea dreaptă. În caz contrar, actualizăm dreapta la mid - 1 pentru a căuta în jumătatea stângă.
    //continuam pana cand left > right; si indica target nu se afla in array  si returnam -1

    //complexitate: T O(log n) ->unde n este numărul de elemente din array. La fiecare pas al căutării binare, intervalul de căutare este împărțit la 2, reducând efectiv spațiul de căutare la jumătate.
    //complexitate: S O(1)
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] >= nums[left]) {
                // Jumătatea din stanga este sortată
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; //target-ul se afla in jumatatea din stanga
                } else {
                    left = mid + 1; //target-ul se afla in jumatatea din dreapta
                }
            } else {
                // Jumătatea din dreapt este sortată
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; //target-ul se afla in jumatatea din dreapta
                } else {
                    right = mid - 1; //target-ul se afla in jumatatea din stanga
                }
            }
        }
        return -1;//elementul nu a fost gasit
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));
    }
}
