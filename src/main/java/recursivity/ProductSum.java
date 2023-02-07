package recursivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {

    public static void main(String[] args) {
        //[5, 2, [7, -1], 3, [6,[-13, 8], 4 ]]  //-13+8=-5*3(nivelul)=-15+10=-5*2(nivelul)=-10;
        //5+2 + 2*6 + 3-10
        List<Object> specialArray = new ArrayList<>();
        List<Integer> firstArray = new ArrayList<>();
        firstArray.add(7);
        firstArray.add(-1);
        specialArray.add(5);
        specialArray.add(2);

        specialArray.add(firstArray);
        System.out.println(productSum(specialArray, 1));
    }

    public static int productSum(List<Object> specialArray, int multiplier) {
        int sum = 0;
        for (Object el : specialArray) {
            if (el instanceof ArrayList) {
                ArrayList<Object> newSpecialArray = (ArrayList<Object>) el;
                sum += productSum(newSpecialArray, multiplier + 1);
            } else {
                sum += (Integer) el;
            }
        }
        return sum * multiplier;
    }


}
