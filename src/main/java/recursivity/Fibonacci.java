package recursivity;

public class Fibonacci {

    public static void main(String[] args) {
        //0,1,1,2,3,5,8,13,21,34
        System.out.println(fib(7));
    }

    public static int fib(int n) {
        if (n == 2) {
            return 1;
        } else if (n == 1) {
            return 0;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
