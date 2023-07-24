package linkedList;

public class FizzBuzz {

    //Write a program that prints the numbers from 1 to 100 and for multiples of ‘3’ print “Fizz” instead of the number and for the multiples of ‘5’ print “Buzz”.

    //--acoperim cazul în care un număr este divizibil atât cu 3, cât și cu 5->FizzBuzz

    //CT:O(100); CS:O(1)
    public static void main(String[] args) {
        int n = 100;

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else { // daca nu e divizibil cu 3 sau 5
                System.out.println(i);
            }
        }
    }

}

