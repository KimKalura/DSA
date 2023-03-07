package generalarrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    //trebuie sa parcurgem matricea in modul spirala:

    //1, 2, 3, 4
    //12,13,14,5
    //11,16,15,6
    //10,9, 8, 7

    //startRow
    //endRow
    //startCol
    //endColl

    //int[][]
    //a[i][j]

    //for (int i=0; i<rows; i++){
    //for(int j=0; j<cols; j++ {
    //sout(a[i][j]);
    //}
    //}

    //sR=0
    //eR=arr.length-1
    //sC=0
    //eC=arr[0].length-1

    //atat timp cat sR<=eR && sC<=eC

    //prima latura: for col sC->eC  : iau arr[sR][col] 1234
    //latura din dreapta: for row sR+1->eR: iau arr[row][eC] 4567, 56; +1 ca sa nu il mai iau odata pe 4
    //latura de jos: for col eC-1->sC: iau arr[eR][col]   -1 sa nu se repe 7
    //latura din stanga: for row eR-1->sR: iau arr[row][sC]

    //pt a merge in mijloc:
    //sR++
    //eR--
    //sC++
    //eC--

    //parcurgem elem de pe exterior de la 1 pana la 12, si recursiv apelam 13,14,15,16; *se poate face si recursiv si  iterativ(var normala)
    // ma duc cu 4 foruri pt cele 4 laturi

    public static List<Integer> spiralTraverse(int[][] array) {
        ArrayList<Integer> result = new ArrayList<>();
        int startRow = 0;
        int endRow = array.length - 1;
        int startCol = 0;
        int endCol = array[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int col = startCol; col <= endCol; col++) {
                result.add(array[startRow][col]);
            }
            for (int row = startRow + 1; row <= endRow; row++) {
                result.add(array[row][endCol]);
            }
            for (int col = endCol - 1; col >= startCol; col--) {
                result.add(array[endRow][col]);
            }
            for (int row = endRow - 1; row >= startRow; row--) {
                result.add(array[row][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };

        //afisare matrix
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
