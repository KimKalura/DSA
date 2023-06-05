package trees;

import javax.swing.tree.TreeNode;

public class BTMaximumDepth { //*

    static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    // abordare recursiva
    // *adâncimea maximă a unui arbore este înălțimea maximă a subarborilor din stânga și din dreapta, plus 1 pentru nodul curent.
    // adun la fiecare pas  adancimea cat a fost + adancimile recursive ale celorlalte ramuri (stg + dr)

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;

    }


    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        BTMaximumDepth solution = new BTMaximumDepth();

        int maxDepth = solution.maxDepth(root);
        System.out.println(maxDepth); // Output: 3

    }

}
