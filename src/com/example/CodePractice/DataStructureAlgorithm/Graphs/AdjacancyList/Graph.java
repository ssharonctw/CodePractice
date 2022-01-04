package com.example.CodePractice.DataStructureAlgorithm.Graphs.AdjacancyList;
import java.util.*;

public class Graph {

    ArrayList<LinkedList<Node>> alist;

    Graph(){
        alist = new ArrayList<>();
    }

    public void addNode(Node n){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(n);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        for(Node n: currentList){
            if(n == dstNode){return true;}
        }
        return false;
    }

    public void print(){
        for(LinkedList<Node> list: alist){
            for(Node n: list){
                System.out.print(n.data+" -> ");
            }
            System.out.println();
        }
    }
}
