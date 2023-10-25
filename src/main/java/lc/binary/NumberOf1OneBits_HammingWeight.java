package lc.binary;

public class NumberOf1OneBits_HammingWeight {
    // *Hamming weight = number of nonzero components in the received code
    //Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
    //Note:
    //•	Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
    //•	In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.


    //Input: n = 00000000000000000000000000001011
    //Output: 3
    //Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.

    //Input: n = 00000000000000000000000010000000
    //Output: 1
    //Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.

    //Input: n = 11111111111111111111111111111101
    //Output: 31
    //Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.


    //variabila count va numara de cate ori apare "1"
    //mergem atat timp cat n este diferit de 0

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) { //*
        int count = 0;
        int mask = 1;

        //sol1
        while (n != 0) {
            count += n & 1;
            n >>>= 1; //>>>= operator de atribuire care atribuie rezultatul unei operații de schimbare la dreapta înapoi variabilei din partea stângă
        }
        return count;

        //sol2;  TC: O(32)->O(1)
        /*while (n != 0) {
            count += n % 2;
            n = n >> 1;
        }
        return count;*/
        //sol2 imbunatatita
       /* while (n != 0) {
            n=n&(n-1);
            count +=1;
        }
        return count;*/


        //sol3
        /*for (int i = 0; i < 32; i++) { // 32 biti
            if ((n & mask) != 0) {
                count++;
            }
            mask <<= 1;
        }
        return count;*/

        //sol4; RECURSIV
        /*if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return hammingWeight(n & (n - 1)) + 1;*/
    }

    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n)); // Output: 3
    }
}
