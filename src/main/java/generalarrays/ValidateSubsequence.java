package generalarrays;

public class ValidateSubsequence {

    public static void main(String[] args) {
        //Subsir al unui array (validate subsequence)
        //Avand la dispozitie doua array-uri, verifica daca al doilea este subsir al primului.
        //De exemplu, daca array-ul [1,3,4] este subsir al array-ului [1,2,3,4]
        //Dar si [2,4] este subsir al array-ului [1,2,3,4].
        //E nevoie sa se pastreze ordinea, dar elementele nu trebuie sa fie neaparat consecutive.
        //
        //Input:
        //array1: [5,1,2,6,25,5,-1,8,10]
        //array2: [1,6,-1,10]
        //
        //Output: true (array2 este subsir al lui array1)

        int[] array1 = {5, 1, 2, 6, 25, 5, -1, 8, 10};
        int[] array2 = {1, 6, -1, 10};

        System.out.println(validateSubsequence(array1, array2));


    }
        //optiuni
    //1.parcurg prima data arr2 si apoi arr1
    //2.sau din arr1 generam toate subarrayurile: 5cu1, 5cu1cu2, 5cu1cu25,5cu1cu25cu5, - nu facem asta
    //3.avem 2 indici pe care ii luam in acelasi timp din 2 arrayuri --while ar trebui
                //compar 5din primul arr cu 1 din al doilea arr si veem ca nu sunt egale
                //apoi ne deplasam cu pointerul de la primul array la urmatorul elem si avem 1 = cu 1 din al doilea elem si sunt egale
                //si apoi ne deplasam cu ambii pointeri 6cu 2 nu sunt egale,
                //de deplasam cu pointerul de sus la 6 6==6. da etc
    public static boolean validateSubsequence(int[] a, int[] b) {
        int p1 = 0;
        int p2 = 0;
        while (p1 < a.length && p2 < b.length) {
            if (b[p2] == a[p1]) {
                p2++;
            }
            p1++;
        }
        return p2 == b.length;
    }
}
