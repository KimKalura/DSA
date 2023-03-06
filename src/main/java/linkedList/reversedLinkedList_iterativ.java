package linkedList;

public class reversedLinkedList_iterativ {

//   class LinkedNode
//    {
//        int data;
//        LinkedNode next;
//
//        LinkedNode(int data, LinkedNode next)
//        {
//            this.data = data;
//            this.next = next;
//        }
//    }
//
//    class Main
//    {
//
//        public static void printLinkedList(LinkedNode firstNode)
//        {
//            LinkedNode pointer = firstNode;
//            while (pointer != null)
//            {
//                System.out.print(pointer.data + " —> ");
//                pointer = pointer.next;
//            }
//
//            System.out.println("null");
//        }
//
//
//        public static LinkedNode reverse(LinkedNode firstNode)
//        {
//            LinkedNode previous = null;
//            LinkedNode current = firstNode;
//
//
//            while (current != null)
//            {
//
//                LinkedNode next = current.next;
//
//                current.next = previous;
//
//                previous = current;
//                current = next;
//            }
//
//
//            return previous;
//        }
//
//        public static void main(String[] args)
//        {
//
//            int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//
//            LinkedNode firstNode = null;
//            for (int i = keys.length - 1; i >= 0; i--) {
//                firstNode = new LinkedNode(keys[i], firstNode);
//            }
//
//            firstNode = reverse(firstNode);
//            printLinkedList(firstNode);
//        }
//    }

//    Output:
//
//   9 -> 8 -> 7 -> 6 —> 5 —> 4 —> 3 —> 2 —> 1 —> null
//
//    Time Complexity: O(n)
//    Space Complexity: O(1)


}
