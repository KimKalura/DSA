package linkedList;

public class reversedLinkedList_recursiv {


//    class LinkNode
//    {
//        int data;
//        LinkNode next;
//
//        LinkNode(int data) {
//            this.data = data;
//        }
//    }
//
//    class Main
//    {
//
//        public static void printList(LinkNode head)
//        {
//            LinkNode pointer = head;
//            while (pointer != null)
//            {
//                System.out.print(pointer.data + " —> ");
//                pointer = pointer;
//            }
//            System.out.println("null");
//        }
//
//
//        public static LinkNode push(LinkNode head, int data)
//        {
//            LinkNode node = new LinkNode(data);
//            node.next = head;
//            return node;
//        }
//
//
//        public static LinkNode reverse(LinkNode head, Node firstNode)
//        {
//            LinkNode first, rest;
//            if (head == null) {
//                return firstNode;
//            }
//            first = head;
//            rest = first.next;
//            if (rest == null)
//            {
//                firstNode = first;
//                return firstNode;
//            }
//            firstNode = reverse(rest, firstNode);
//            rest.next = first;
//            first.next = null;
//
//            return firstNode;
//        }
//        public static LinkNode reverse(LinkNode head) {
//            return reverse(head, head);
//        }
//        public static void main(String[] args)
//        {
//            int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//
//            LinkNode head = null;
//            for (int i = keys.length - 1; i >=0; i--) {
//                head = push(head, keys[i]);
//            }
//
//            head = reverse(head);
//            printList(head);
//        }
//    }



    //Output:
    //
    //9 -> 8 -> 7 -> 6 —> 5 —> 4 —> 3 —> 2 —> 1 —> null
    //
    //Time Complexity: O(n)
    //Space Complexity: O(1)

}
