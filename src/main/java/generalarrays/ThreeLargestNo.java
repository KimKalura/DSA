package generalarrays;

public class ThreeLargestNo {

    public static void main(String[] args) {
        //Cele mai mari 3 numere dintr-un array

        int[] arr = {141, 1, 17, -7, -17, -27, 18, 561, 8, 7, 7};
        int[] result = findNo(arr);

        for (int num : result) {
            System.out.println(num);
        }
    }

    public static int[] findNo(int[] arr) {  //TC:O(N), SC:O(1)
        int[] threeLargestNo = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int num : arr) {
            if (num > threeLargestNo[2]) {
                shiftAndInsert(threeLargestNo, num, 2);
            } else if (num > threeLargestNo[1]) {
                shiftAndInsert(threeLargestNo, num, 1);

            } else if (num > threeLargestNo[0]) {
                shiftAndInsert(threeLargestNo, num, 0);

            }
        }
        return threeLargestNo;
    }

    private static void shiftAndInsert(int[] threeLargestNo, int num, int i) {
        for (int j = 0; j < i; j++) {
            threeLargestNo[j] = threeLargestNo[j + 1];
        }
        threeLargestNo[i] = num;
    }
}
