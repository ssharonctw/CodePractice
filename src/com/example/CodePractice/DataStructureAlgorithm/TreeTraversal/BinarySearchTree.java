package com.example.CodePractice.DataStructureAlgorithm.TreeTraversal;

public class BinarySearchTree {
    Node root;

    public void insert(Node node){
        root = insertHelper(root, node.data);
    }
    private Node insertHelper(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        else if(data < root.data){
            //if current node (root) is bigger than the data, traverse to the left side of the root
            root.left = insertHelper(root.left, data);
        }
        else if(data > root.data){
            //if current node (root) is smaller than the data, traverse to the right side of the root
            root.right = insertHelper(root.right, data);
        }
        //will only reach here if root = value (adding duplicates). Then do nothing and just return current node
        return root;
    }
    public void display(){
        displayHelper(root);
    }
    private void displayHelper(Node root){
        //below will display nodes in inorder
        if(root!=null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    public boolean search(int data){
        return searchHelper(root, data);
    }
    private boolean searchHelper(Node root, int data){
        if(root == null){
            System.out.println(data + " not found.");
            return false;
        }
        else if(data < root.data){
            return searchHelper(root.left, data);
        }
        else if(data > root.data){
            return searchHelper(root.right, data);
        }
        //will only reach here if root.data = data, meaning the data is found
        return true;
    }

    public void remove(int data){
        if(search(data)==true){
            removeHelper(root, data);
        }
        else{
            System.out.println(data + " could not be found hence can't remove");
        }
    }
    private Node removeHelper(Node root, int data){
        if(root == null){
            return null;
        }
        else if(data < root.data){
            //data smaller than current node, traverse to the left
            root.left = removeHelper(root.left, data);
        }
        else if(data > root.data){
            //data larger than current node, traverse to the right
            root.right = removeHelper(root.right, data);
        }
        else{
            //data is found at current node
            //case 1: current node have no children, simply delete current node
            if(root.right!=null){
                //find the smallest value of the right subtree to replace current node
                root.data = successor(root);
                //after setting current node's value to the replacing value, remove the value from it's right subtree
                root.right = removeHelper(root.right, root.data);
            }
            else if(root.left!=null){
                //find the largest value of left subtree to replace current node
                root.data = predecessor(root);
                //after setting current node's value to the replacing value, remove the value from it's left subtree
                root.left = removeHelper(root.left, root.data);
            }
            else{
                //reaching here mean the data is found at a node with no children
                //simply remove current node (without the need to shift anything since there's no subtree
                root = null;
            }
        }
        return root;
    }

    private int successor (Node root){
        //find the least value below the right child of this root
        root = root.right;
        while(root.left!=null){
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(Node root){
        //find the greatest value below the left child of this root node
        root = root.left;
        while(root.right!=null){
            root = root.right;
        }
        return root.data;
    }

    //Inorder: left -> root -> right
    public void traverseTreeInorder(Node root){
        if(root!=null) {
            traverseTreeInorder(root.left);
            System.out.println(root.data);
            traverseTreeInorder(root.right);
        }
    }

    //Postorder: left -> right -> root
    public void traverseTreePostorder(Node root){
        if(root!=null) {
            traverseTreeInorder(root.left);
            traverseTreeInorder(root.right);
            System.out.println(root.data);
        }
    }

    //Preorder: root -> left -> right
    public void traverseTreePreorder(Node root){
        if(root!=null) {
            System.out.println(root.data);
            traverseTreeInorder(root.left);
            traverseTreeInorder(root.right);
        }
    }

}
