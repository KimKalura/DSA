package generalarrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfProducts {

    //input: 5,1,4,2
    //outputL 8, 40, 10, 20 - de ex: 8 este 1*4*2

    //sol1 - brute force
    //parcurgem elementele din array
    //pentru fiecare element - parcurgem celelalte element si calculam produsul - il punem la pozitia i intr-un array rezultat
    //complexitate - O(N2) timp si O(N) spatiu

    //sol2
    //fac produsul tuturor numelor din array
    //mai parcurg o data si impart produsul la numarul la care sunt si pun rezultatul in array-ul rezultat
    //complexitate - O(N) T si O(N) spatiu
    //** cu LISTA
    //1.aflam produsul tuturor nr
    // parcurgem lista de numere
    //2.impartim produsul la fiecare numar din lista
    //3.inlocuim elementele si afisam lista

    public static List<Integer> findNoOfProduct(List<Integer> nums) {
        List<Integer> listNoOfProduct = new ArrayList<>();
        int prod = 1;
        for (int i = 0; i < nums.size(); i++) {
            prod *= nums.get(i);
        }

        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, (prod / nums.get(i)));
            //listNoOfProduct.add(prod / nums.get(i));
        }
        return listNoOfProduct;
    }

    //sol3 - construim toate produsele din stanga fiecarui element si toate prod din dreapta fiecarui element
    //inmultim , pentru fiecare element, produsul din st cu produsul din dreapta
    //O(N) TS
    public static int[] arrayProducts(int[] arr) {
        int[] leftProducts = new int[arr.length];
        int[] rightProducts = new int[arr.length];

        int[] result = new int[arr.length];
        int productLeft = 1;
        int productRight = 1;

        for (int i = 0; i < arr.length; i++) {
            leftProducts[i] = productLeft;
            productLeft = productLeft * arr[i];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            rightProducts[i] = productRight;
            productRight = productRight * arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }
        return result;
    }
}
