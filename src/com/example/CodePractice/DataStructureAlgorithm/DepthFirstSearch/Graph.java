package com.example.CodePractice.DataStructureAlgorithm.DepthFirstSearch;
import java.util.*;

public class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size){

        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    public void addNode(Node node) {

        nodes.add(node);
    }
    public void addEdge(int src, int dst) {

        matrix[src][dst] = 1;
    }
    public boolean checkEdge(int src, int dst) {

        if(matrix[src][dst] == 1) {
            return true;
        }
        else {
            return false;
        }
    }
    public void print() {

        System.out.print("  ");
        for(Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void depthFirstSearch(int src) {
        //this boolean array is to store the is-visited status of each node
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);
    }
    private void dFSHelper(int src, boolean[] visited) {

        if(visited[src]) {
            return;
        }
        else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }

        //the is to check if the current node (src) has any adjacent node (adjacent node of src will have matrix[src][i] == 1)
        //if there is an adjacent node, call the DFS helper again to check on behalf of the adjacent node
        for(int i = 0; i < matrix[src].length; i++) {
            if(matrix[src][i] == 1) {
                dFSHelper(i, visited);
            }
        }
        return;
    }
}
