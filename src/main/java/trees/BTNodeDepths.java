package trees;

public class BTNodeDepths {
    static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    //sa calculam suma adancimilor nodurilor:

    //O(N) TS
    public static int nodeDepths(Node tree, int depth) {
        if (tree == null) {
            return 0;
        }
        return depth + nodeDepths(tree.left, depth + 1) + nodeDepths(tree.right, depth + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //int totalDepth = nodeDepths(root, 0);
        System.out.println(nodeDepths(root, 0));
    }
}
