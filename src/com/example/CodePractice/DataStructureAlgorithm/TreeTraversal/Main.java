package com.example.CodePractice.DataStructureAlgorithm.TreeTraversal;

//Inorder: left -> root -> right
//Postorder: left -> right -> root
//Preorder: root -> left -> right

public class Main {
    public static void main(String args[]){
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

        tree.display();

        //Inorder: left -> root -> right
        System.out.println("Inorder: ");
        tree.traverseTreeInorder(tree.root);

        //Postorder: left -> right -> root
        System.out.println("Postorder: ");
        tree.traverseTreePostorder(tree.root);

        //Preorder: root -> left -> right
        System.out.println("Preorder: ");
        tree.traverseTreePreorder(tree.root);
    }
}
