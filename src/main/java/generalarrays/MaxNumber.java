package generalarrays;

public class MaxNumber {

    public static void main(String[] args) {
        //find maximum number in the array using return method

        int[] array = {1,-2,3,0,5,6,7,8,100,10};

        //int myMax = max(array);
        System.out.println(max(array));
    }

    public static int max(int[] array) {
        int max = 0;
        for(int i =0; i< array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


}
