package trees;

public class BTFindSuccessor {

    //*

    static class Node {
        public int key;
        public Node left;
        public Node right;
        public Node parent;

        Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
            this.parent = null;
        }
    }

    //tc:O(N)-> n nr de noduri; parcurgem fiecare nod
    //sc: O()
    static class BinarySearchTree {
        Node root;

        Node findInOrderSuccessor(Node inputNode) {
            if (inputNode == null) {
                return null;
            }
            if (inputNode.right != null) {
                //*If the node has a right subtree, the successor is the leftmost
                // node in that subtree.
                return getMostLeft(inputNode.right);
            }
            Node parent = inputNode.parent; //12
            Node child = inputNode; //14
            //20

            while (parent.right == child) {
                if (parent.parent == null) {
                    return null;
                }
                child = parent;
                parent = parent.parent;

            }
            return parent;
            // if node.right exists
            //i'll need to go down to the right
            // check if left exists
            //if it exists, go all the way left until

            //i'll need to go up
            //go to parent
            //check which side you came from
            //if you came from left side, return parent
            //if you came from right side, go up again

        }

        //apelam recursiv pt partea stg
        Node getMostLeft(Node x) {
            if (x.left == null) {
                return x;
            }
            return getMostLeft(x.left);
        }

        // Given a binary search tree and a number, inserts a new node
        // with the given number in the current place in the tree
        void insert(int key) {

            if (this.root == null) {
                this.root = new Node(key);
                return;
            }

            // 2) Otherwise, create a node with the key
            //  and traverse the tree to find where to
            //  to insert the new node
            Node currentNode = this.root;
            Node newNode = new Node(key);

            while (currentNode != null) {
                if (key < currentNode.key) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        newNode.parent = currentNode;
                        break;
                    } else {
                        currentNode = currentNode.left;
                    }
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        newNode.parent = currentNode;
                        break;
                    } else {
                        currentNode = currentNode.right;
                    }
                }
            }
        }

        //return a reference to a node in the BST by its key.
        //Use this method when you need a node to test your findInOrderSuccessor method on
        Node getNodeByKey(int key) {
            Node currentNode = this.root;
            while (currentNode != null) {
                if (key == currentNode.key) {
                    return currentNode;
                }
                if (key < currentNode.key) {
                    currentNode = currentNode.left;
                } else {
                    currentNode = currentNode.right;
                }
            }
            return null;
        }
    }


    public static void main(String[] args) {
        Node test = null;
        Node succ = null;
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(20);
        tree.insert(9);
        tree.insert(25);
        tree.insert(5);
        tree.insert(12);
        tree.insert(11);
        tree.insert(14);

        test = tree.getNodeByKey(9);
        succ = tree.findInOrderSuccessor(test);
        if (succ != null) {
            System.out.println("inOrder successor of " + test.key +
                    " is " + succ.key);
        } else {
            System.out.println("inOrder successor does not exist");
        }

        /*
	            20
			   / \
			  9   25
			 / \
			5   12
			    / \
			   11  14
        */
    }

}
