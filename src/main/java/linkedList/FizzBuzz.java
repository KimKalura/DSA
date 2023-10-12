package linkedList;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    //Write a program that prints the numbers from 1 to 100 and for multiples of ‘3’ print “Fizz” instead of the number and for the multiples of ‘5’ print “Buzz”.

    //--acoperim cazul în care un număr este divizibil atât cu 3, cât și cu 5->FizzBuzz

    //CT:O(100); CS:O(1)
    public static void main(String[] args) {
        //int n = 100;

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {//if((i%3==0)&&(i%5==0))
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else { // daca nu e divizibil cu 3 sau 5
                System.out.println(i);
            }
        }
        //V2
        //System.out.println(fizzBuzz(100));
    }

    //V2
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1, fizz = 0, buzz = 0; i < n; i++) {
            fizz++;
            buzz++;
            if (fizz == 3 && buzz == 5) {
                fizz = 0;
                buzz = 0;
                list.add("FizzBuzz");
            } else if (fizz == 3) {
                fizz = 0;
                list.add("Fizz");
            } else if (buzz == 5) {
                buzz = 0;
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

}

