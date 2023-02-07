package grafs;

import java.util.*;

public class BFS {

    public static class Node {
        public String value;
        List<Node> children = new ArrayList<>();

        public Node(String value) {
            this.value = value;
        }


        //O(V+E) T; O(V) S
        //cat timp mai sunt noduri in coada, iau din coada ce este si il fac elementul curent
        //apoi stergem elem current din coada - A,
        //bag current in arr
        // adaug  copiii in coada

        public List<String> breadthFirstSearch(List<String> array) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(this);
            while (queue.isEmpty()) {
                Node current = queue.poll();
                array.add(current.value);
                queue.addAll(current.children);
            }
            return array;
        }
    }
}
