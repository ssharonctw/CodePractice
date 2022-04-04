package com.example.CodePractice.DataStructureAlgorithm.PriorityQueue;

/*Priority Queue
A FIFO Data structure that serves elements with the highest priorities first
before elements with lower priority

*/

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

        public static void main(String args[]){
            //queue are an interface so cannot be initiated directly
            //so cannot be Queue<Double> queue = new Queue<>();
            //Queue<Double> queue = new LinkedList<>();
            Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
            queue.offer(3.0);
            queue.offer(2.5);
            queue.offer(4.0);
            queue.offer(1.5);
            queue.offer(2.0);


            //elements will get polled fifo
            //if queue were linkedList, it will come out FIFO
            //if queue were PriorityQueue<double>(), it will come out in ascending order
            //if queue were PriorityQueue<double>(Collections.reverseOrder), it will come out in descending order
            //if queue were PriorityQueue<Char>(), it will come out in alphabetical order
            //if queue were PriorityQueue<Char>(Collections.reverseOrder), it will come out in reversed-alphabetical order
            while(!queue.isEmpty()){
                System.out.print(queue.poll() +", ");
            }

            Queue<Integer> queue1 = new PriorityQueue<>((a,b)->a-b);
            queue1.add(3);
            queue1.add(2);
            queue1.offer(4);
            queue1.offer(1);
            queue1.offer(6);
            System.out.println(Integer.compare(5,10));
            System.out.println(queue1.isEmpty());
            while(!queue1.isEmpty()){
                System.out.print(queue1.poll() +", ");
            }
            System.out.println(queue1.isEmpty());


        }

}
