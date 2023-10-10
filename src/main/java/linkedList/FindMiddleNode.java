package linkedList;

public class FindMiddleNode {
    //1->2->3->4->5

    //sol1
    //parcurgem toata lista ca sa aflam nr de noduri
    //mai parcurgem o data pana la numarul de noduri impartit la 2 (pana la jumatate)

    //sol2

    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static int findMiddleNode(Node head) {
        Node first = head;
        Node second = head;
        while (second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        return first.value;
    }

    public static void main(String[] args) {
        /*Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println(findMiddleNode(head)); //3*/

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        System.out.println(findMiddleNode(node1));//3
    }
}
