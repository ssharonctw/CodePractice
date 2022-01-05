package com.example.CodePractice.DataStructureAlgorithm.BreadthFirstSearch;
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

    public void breadthFirstSearch(int src){
        //Queue is just an interface, need to use a data structure that utilizes interface: LinkedList or PriorityQueue
        Queue<Integer> queue = new LinkedList<>();
        //visited[] is used to store the visited status of each node
        //  Careful: Boolean and boolean is different.
        //  Boolean should be treated like a pointer, if unassigned, will be null
        //  hence need to check the falsity by visited[i] == null or Boolean.False.equals(visited[i])
        Boolean[] visited = new Boolean[matrix.length];

        queue.offer(src);
        visited[src]=true;

        while(queue.size()!=0){
            //queue is FIFO, get the oldest index that are store in queue to start checking all it's adjacant node
            src = queue.poll();
            System.out.println(nodes.get(src).data + "=visited");

            //loop through all adjacent node of src, and store them into the queue
            for (int i=0; i<matrix[src].length;i++){
                //check all adjacent (matrix[src][i]==1) and unvisited (!visited[i]) node
                if(matrix[src][i]==1 && visited[i]==null){
                    visited[i]=true;
                    queue.offer(i);
                }
            }
        }

    }
}
