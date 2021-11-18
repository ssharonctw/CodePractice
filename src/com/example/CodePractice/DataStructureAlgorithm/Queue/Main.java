package com.example.CodePractice.DataStructureAlgorithm.Queue;


//Queue is a FIFO data structure, a linear data structure
//Queue is a linkedlist

//head is the first item
//tail is the last item

//in java: poll():remove/dequeue: remove an object at the start of the queue

import java.util.LinkedList;
import java.util.Queue;

//in java: offer(): add/enqueue: add an object to the end to the queue
public class Main {
    public static void main(String[] args){
        //cannot directly instantiate queue because queue is an Interface
        //there are 2 classes that implements queue in java collections: the LinkedList and PriorityQueue
        //Queue<String> queue = new Queue<String>();
        Queue<String> queue = new LinkedList<String>();

        //add the following four person to the queue
        //normally uses offer() but not add() althought they are similar as add() may throw exception when out of index
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        //check who's in the front
        System.out.println("peak who's at the head "+queue.peek());

        //remove one by one
        //normally uses poll() but not remove() although they are similar as remove() may throw exception when out of index
        queue.poll();  //remove Karen
        queue.poll();  //remove Chad
        queue.poll();  //remove Steve

        //check if a queue is empty
        System.out.println("queue is empty? "+ queue.isEmpty());

        //check the size of a queue
        System.out.println("queue current size: " + queue.size());

        //check if a queue contains an object
        System.out.println("queue is empty? " + queue.contains("Harold"));

    }
}




