package linkedList;

public class reversedLinkedList_recursiv {

    //Output:
    //9 -> 8 -> 7 -> 6 —> 5 —> 4 —> 3 —> 2 —> 1 —> null
    //Time Complexity: O(N)
    //Space Complexity: O(N)

    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }


    public static void printList(Node head) {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.value + " -> ");
            pointer = pointer;
        }
        System.out.println("null");
    }


    public static Node push(Node head, int data) {
        Node node = new Node(data);
        node.next = head;
        return node;
    }


    public static Node reverse(Node head) {//, Node firstNode
        //Node first;
        //Node rest;

        /*if (head == null) {
            return firstNode;
        }

        Node first = head;
        Node rest = first.next;

        if (rest == null) {
            firstNode = first;
            return firstNode;
        }
        firstNode = reverse(rest, firstNode);
        rest.next = first;
        first.next = null;

        return firstNode;*/

        if (head == null || head.next == null) {
            return head;
        }
        Node rest = reverse(head.next); //inversam restul listei si punem primul el la sfarsit:
        head.next.next = head;

        head.next = null;

        return rest; //head pointer
    }

    /*public static Node reverse(Node head) {
        return reverse(head, head);
    }*/

    public static void main(String[] args) {
        /*int[] keys = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        LinkNode head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = push(head, keys[i]);
        }

        head = reverse(head);
        printList(head);*/

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

        System.out.println("RECURSIV: ");
        Node node = reverse(node1);
        while (node != null) {
            System.out.print(node.value + "->");
            node = node.next;
        }

    }

}
