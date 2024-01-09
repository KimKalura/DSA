package lc.string;

public class CountTheReversals {
    //Given a string S consisting of only opening and closing curly brackets '{' and '}', find out the minimum number of reversals required to
    // convert the string into a balanced expression.
    //A reversal means changing '{' to '}' or vice-versa.

    //Input:
    //S = "}{{}}{{{"
    //Output: 3
    //Explanation: One way to balance is:
    //"{{{}}{}}". There is no balanced sequence
    //that can be formed in lesser reversals.

    //Input:
    //S = "{{}{{{}{{}}{{"
    //Output: -1
    //Explanation: There's no way we can balance
    //this sequence of braces.

    // tebuie sa avem un nr par al parantezelor, daca nu, returnam direct -1 ->adica lungimea stringului sa se imparta la 2
    // parcurgem stringul:
    // daca caracterul la care suntem este paranteza deschisa {, incrementam temp++
    // daca ch este parateza inchisa }:
            //daca temp este 0, inseamna ca nu exista paranteza pt parateza inchisa curenta }. Astfel, incrementam res si modificam temp la 1
            //daca temp nu este 0, decrementam pentru a balansa parantezele
    //verificam daca mai exista parateze deschise, adica temp>0
    //la final returnam result

    //TC: O(N)
    //SC: O(1)
    static int countRev(String s) {
        int temp = 0; //tine evidenta parantezelor care nu sunt egale
        int res = 0; //reprez nr minim de inversari necesare

        if (s.length() % 2 != 0) {
            return -1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{') {
                temp++;
            } else {
                if (temp == 0) {
                    res++;
                    temp++;
                } else {
                    temp--;
                }
            }
        }

        if (temp > 0) {
            res += temp / 2;
        }
        return res;
    }

    public static void main(String[] args) {
        String expr = "}}{{";
        String expr2 = "}{{}}{{{";
        String expr3 = "{{}{{{}{{}}{{";
        String expr4 = "{{{";
        System.out.println(countRev(expr));
        System.out.println(countRev(expr2));
        System.out.println(countRev(expr3));
        System.out.println(countRev(expr4));
    }

}
