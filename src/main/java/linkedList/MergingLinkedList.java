package linkedList;

import java.util.HashSet;
import java.util.Set;

public class MergingLinkedList {
    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    //2->3->8->4
    //6->8->4
    //VARIANTE:
    //luam ceva ajutator ->set
    //sortam
    //parcurgem cu 2 pointeri

    //returneaza un nod
    //O(N+N)T-avem 2 inputuri (de difetite marimi)si pe ambele le parcurgem, O(N)S
    //-->luam intr-un set, parcurgem cu al doilea cand dam de primul element care exista deja in set, de acolo inseamna ca incepe intersectia
    public static Node mergingLinkedList(Node linkedList1, Node linkedList2) {
        Set<Integer> linkedList1Set = new HashSet<>();
        Node currentNode = linkedList1;
        while (currentNode != null) {
            linkedList1Set.add(currentNode.value);
            currentNode = currentNode.next;
        }
        currentNode = linkedList2;
        while (currentNode != null) {
            if (linkedList1Set.contains(currentNode.value)) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    //5->2->3->8->4
    //6->8->4
    //ma duc cu pointerul cat e diferenta -adica cu 2:
        //1.aflam lungimea primei liste si celei de-a doua liste ca sa putem face diferenta ...
        //2.si sa ne mutam cu pointerul la 3
        //3.mergem cu pointerul cate unu si sa comparam la fiecare pas daca sunt egale nodurile
    public static Integer mergingLinkedList2(Node linkedList1, Node linkedList2) {
        Node currentNodeOne = linkedList1;
        int firstLinkedListLength = 0;
        while (currentNodeOne != null) {
            firstLinkedListLength++;
            currentNodeOne = currentNodeOne.next;
        }

        Node currentNodeTwo = linkedList2;
        int secondLinkedListLength = 0;
        while (currentNodeTwo != null) {
            secondLinkedListLength++;
            currentNodeTwo = currentNodeTwo.next;
        }

        int difference = Math.abs(firstLinkedListLength - secondLinkedListLength);

        Node biggerCurrentNode;
        Node smallerCurrentNode;
        if (firstLinkedListLength > secondLinkedListLength) {
            biggerCurrentNode = linkedList1;
            smallerCurrentNode = linkedList2;
        } else {
            biggerCurrentNode = linkedList2;
            smallerCurrentNode = linkedList1;
        }
        for (int i = 0; i < difference; i++) {
            biggerCurrentNode = biggerCurrentNode.next;
        }
        while (biggerCurrentNode.value != smallerCurrentNode.value) {
            biggerCurrentNode = biggerCurrentNode.next;
            smallerCurrentNode = smallerCurrentNode.next;
        }
        return biggerCurrentNode.value;
    }

    public static void main(String[] args) {
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(8);
        Node node4 = new Node(4);

        Node node5 = new Node(6);
        Node node6 = new Node(8);
        Node node7 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        node5.next = node6;
        node6.next = node7;
        node7.next = null;

        System.out.println(mergingLinkedList(node1, node5));//.value
        System.out.println((mergingLinkedList2(node1, node5)));
    }
}
