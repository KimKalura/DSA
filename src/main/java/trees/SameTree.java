package trees;

public class SameTree {//*

    static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    //Given the roots of two binary trees p and q, write a function to check if they are the same or not.
    //Input: p = [1,2,3], q = [1,2,3]
    //Output: true

    //verificam daca arborii sunt null, inseamna ca sunt la fel, egali -> TRUE
    //daca unul dintre arbore este null sau valorile lui sunt diferite, arnorii nu sunt egali -> FALSE
    //mergem recursiv pe ambii arbori drept+stang

    public boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.value != q.value) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);

        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(3);

        SameTree comparator = new SameTree();
        System.out.println(comparator.isSameTree(p, q));  // Output: true
    }

}
