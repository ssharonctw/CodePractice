package com.example.CodePractice.DataStructureAlgorithm.Graphs.AdjacancyMatrix;
import java.util.*;

public class Graph {

    //this is to store all added nodes, for the convenience to print the A,B,C,D,E when printing the matrix
    ArrayList<Node> nodes;
    //create a 2d array to store 1/0 s to represent edges
    int[][] matrix;

    //constructor to create a graph given the size (number of nodes to store)
    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    //user are expect to pass the index of the src node and dst node to create an edge in between
    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }

    //simply check if matrix[src][dst] has been updated to 1 (will only be 1 if addEdge(src, dst) has been call before
    public boolean checkEdge(int src, int dst){
        return matrix[src][dst]==1;
    }

    public void print(){
        //to print the column header
        System.out.print("  ");
        for(Node n: nodes){
            System.out.print(n.data+" ");
        }
        System.out.println();

        for (int i=0; i<matrix.length; i++){
            System.out.print(nodes.get(i).data+ " ");
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
