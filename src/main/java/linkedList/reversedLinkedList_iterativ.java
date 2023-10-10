package linkedList;

public class reversedLinkedList_iterativ {
    //    Output:
//   9 -> 8 -> 7 -> 6 —> 5 —> 4 —> 3 —> 2 —> 1 —> null
//    Time Complexity: O(n)
//    Space Complexity: O(1)

    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }


    public static void printLinkedList(Node firstNode) {
        Node pointer = firstNode;
        while (pointer != null) {
            System.out.print(pointer.value + " -> ");
            pointer = pointer.next;
        }
        System.out.println("null");
    }


    public static Node reverse(Node firstNode) {
        Node previous = null;
        Node current = firstNode;

        while (current != null) {
            Node next = current.next;//next e pe post de temp
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        /*int[] keys = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        LinkedNode firstNode = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            firstNode = new LinkedNode(keys[i], firstNode);
        }
        firstNode = reverse(firstNode);
        printLinkedList(firstNode);*/


        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = null;

        System.out.println("ITERATIV: ");
        Node node = reverse(node1);
        while (node != null) {
            System.out.print(node.value + "->");
            node = node.next;
        }
    }

}
