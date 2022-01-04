package com.example.CodePractice.DataStructureAlgorithm.Graphs.AdjacancyList;

// Adjacency List = An array/arraylist of linkedlists. (alist)
//			      Each LinkedList has a unique node at the head.
//			      All adjacent neighbors to that node (dstNode) are added to that node's linkedlist (currentList) at the tail

//				  runtime complexity to check an Edge: O(v)
//				        v=# of vertices, this is because for each edge, we need to check the linkedlist of that node to confirm if there's a match
//				  space complexity: O(v + e)
//				        e=# of edge

public class Main {
    public static void main(String[] args){
        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        //System.out.println(graph.checkEdge(0, 1));
    }
}
