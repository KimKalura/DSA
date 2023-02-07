package recursivity;

public class Sum {

    public static void main(String[] args) {
        System.out.println(sum(9));
    }
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return sum(n - 1) + n;
        }
    }
}
