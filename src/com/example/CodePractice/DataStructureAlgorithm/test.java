package com.example.CodePractice.DataStructureAlgorithm;

import java.util.*;

public class test {
        public boolean canFinish(int numCourses, int[][] prerequisites) {

            HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();
            HashMap<Integer, Integer> indegree = new HashMap<>();
            HashMap<Integer, Boolean> visited = new HashMap<>();

            for(int i=0; i<numCourses; i++){
                adj.put(i, new ArrayList<Integer>());
                indegree.put(i, 0);
                visited.put(i, false);
            }
            for(int[] pair: prerequisites){
                adj.get(pair[0]).add(pair[1]);
                indegree.put(pair[1], indegree.get(pair[1])+1);
            }

            for(int i=0; i<indegree.size(); i++){
                if(indegree.get(i)==0 && !visited.get(i) ){
                    visited.put(i, true);
                    DFS(i, adj, indegree, visited);
                }
            }

            for(int i=0; i<indegree.size(); i++){
                if(indegree.get(i)>0){
                    return false;
                }
            }

            return true;

        }

        private void DFS(int current, HashMap<Integer, ArrayList<Integer>> adj, HashMap<Integer, Integer> indegree,HashMap<Integer, Boolean> visited){
            for(int neighbor : adj.get(current)){
                visited.put(neighbor, true);
                indegree.put(neighbor, indegree.get(neighbor)-1);
                if(indegree.get(neighbor)<=0 && !visited.get(neighbor) ){
                    DFS(neighbor, adj, indegree, visited);
                }
            }
        }

    }
