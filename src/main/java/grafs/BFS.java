package grafs;

import java.util.*;

public class BFS {

    public static class Node {

        public String value;
        List<Node> children = new ArrayList<>();

        public Node(String value) {
            this.value = value;
        }


        //cat timp mai sunt noduri in coada, iau din coada ce este si il fac elementul curent: current = A
        //1.adaug in coada
        //2.apoi stergem elem current din coada - A,
        //3.adaug current in arr final: arr=[A, B, C
        //4. adaug  copiii lui cuurent in coada
        //apoi se intoarce in while
            //ABCD sunt copii, ii punem in coada:
            //coada:  -> A, B, C, D, E, F, G, H, I, J, K  ->
            //current= A, B, C, D, E, F, G
            //array=[A, B, C, D, E, F, G, H, I, J, K]
                //*scot din coada ca sa pun la current
                //cand pun A in coada, pun si copii lui A tot in coada: BCD
                //cand pun B in coada, pun si copii lui B tot in coada: EF

        //O(V+E) T; O(V) S
        public List<String> breadthFirstSearch(List<String> array) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(this);
            while (!queue.isEmpty()) {
                Node current = queue.poll();
                array.add(current.value);
                queue.addAll(current.children);
            }
            return array;
        }
    }
}
