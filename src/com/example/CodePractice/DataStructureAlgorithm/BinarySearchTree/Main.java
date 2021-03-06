package com.example.CodePractice.DataStructureAlgorithm.BinarySearchTree;

//Binary Search Tree = A tree data structure, where each node is greater than it's left child,
//		               but less than it's right.

//					   benefit: easy to locate a node when they are in this order

//					   time complexity: best case  O(log n)  since each time if removes half of the tree by comparing large/small
//									    worst case O(n)

//					   space complexity: O(n)

public class Main {
    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));
        tree.insert(new Node(1));
        tree.insert(new Node(1));

        tree.display();
        tree.search(0);
        tree.search(5);

        tree.remove(5);
        tree.remove(0);
        tree.display();
    }
}
