package trees;

import java.util.ArrayList;
import java.util.List;

public class BSTFindKthLargestValue {
    static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static List<Integer> inOrder(Node tree, List<Integer> array) {
        if (tree.left != null) {
            inOrder(tree.left, array);
        }
        array.add(tree.value);
        if (tree.right != null) {
            inOrder(tree.right, array);
        }
        return array;
    }

    //O(N) TS (pt spatiu pt ca ne luam array si avem recursivitate de la inOrder
    public static int findKthLargestValue(Node tree, int k) {
        List<Integer> sortedValues = new ArrayList<>();
        inOrder(tree, sortedValues);
        return sortedValues.get(sortedValues.size() - k);
    }

    //*
    public static void main(String[] args) {
        Node node1 = new Node(15);
        Node node2 = new Node(20);
        Node node3 = new Node(16);
        Node node4 = new Node(22);
        node1.left = null;
        node1.right = node2;
        node2.left = node3;
        node2.right = node4;
        node4.left = null;

        System.out.println(findKthLargestValue(node1, 3));
    }
}
