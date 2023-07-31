package lc;

public class ContainerWithMostWater {

    // You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
    //Find two lines that together with the x-axis form a container, such that the container contains the most water.
    //Return the maximum amount of water a container can store.
    //Notice that you may not slant the container.

    //Input: height = [1,8,6,2,5,4,8,3,7]
    //Output: 49
    //Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

    //Input: height = [1,1]
    //Output: 1


    // folosim 2 pointeri: unul va incepe de la inceput, celalalt de la sfarsit
    // maxArea -> se actualizeaza in timpul parcurgerii; tine cantitatea maxima a apei
    // maxArea este actualizată cu valoarea maximă dintre maxArea și currentArea; maxArea va avea  întotdeauna cea mai mare valoare întâlnită până acum.
    // daca L<R, atunci mutam  L spre centru incrementandu-l cu 1 pentru a gasi o zona mai mare

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height1)); // Output: 49

        int[] height2 = {1, 1};
        System.out.println(maxArea(height2)); // Output: 1
    }
}
