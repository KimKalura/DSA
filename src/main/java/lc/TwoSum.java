package lc;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Input: nums = [2,7,11,15], target = 9
    // Output: [0,1]
    // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    //2->0
    //7->1


    // 1.Cream un HashMap pentru a stoca numerele și pozițiile lor
        // Cheie: numărul curent din tablou
        // Valoare: indicele la care se găsește numărul curent
    // 2.obtinem nr curent de la indicele i
    // 3.calculăm numărul x de care avem nevoie pentru a aduna cu 'current' și a obține 'target'
    // 4.verificăm dacă numărul x este prezent în HashMap (adică dacă am găsit deja x anterior)
    // dacă da, înseamnă că am găsit două numere a căror sumă este egală cu 'target'
    // 5.returnăm un hashmap cu indicii celor două numere găsite
        // primul indice este valoarea stocată în HashMap pentru x
        // al doilea indice este indicele curent i
    // 6.dacă numărul x nu este prezent în HashMap, stocăm numărul 'current' în HashMap
    // împreună cu indicele său i

    //CT: O(N); CS: O(N)
    public static int[] twoSum(int[] nums, int target) {
        // prin mapa retin pozitia; mapez nr la index-unde l-am vazut
        //Time:O(n)-avem doar un for, exista n numere in array
        //Space:O(n)
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            // current+x=target;
            // x=target-current
            int x = target - current;

            if (numMap.containsKey(x)) {
                return new int[]{numMap.get(x), i};
            }
            numMap.put(current, i);
        }
        return null; // nici o solutie gasita
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

        //System.out.println(twoSum(nums, 9)); //@adresa
    }
}
