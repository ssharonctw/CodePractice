package com.example.CodePractice.DataStructureAlgorithm.LinkedListVSArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1000000; i++){
            //java supports auto-boxing.  So can directly add primitive even if we declare both as taking <Integer>
            linkedList.add(i);
            arrayList.add(i);
        }

        // ****************LinkedList****************
        startTime = System.nanoTime();

        //linkedList.get(0);  //arrayList faster
        //linkedList.get(500000);  //arraylist way faster since linkedlist will need to travel and arraylist have direct access
        //linkedList.get(999999);  //arraylist faster, linkedlist take less time comparing to above because this linkedlist is a double linkedlist
        //linkedList.remove(0); //linkedlist way faster since it just have to revmoce the first node, while arraylist will need to shift the entire array
        //linkedList.remove(500000); //arraylist faster because less to shift this time, linkedlist still need to travel to middle
        linkedList.remove(999999);//arraylist slightly faster since dont need to sift a huge chunk.  Linkedlist also not slow since it has double linked access

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime +" ns");

        // ****************ArrayList****************

        startTime = System.nanoTime();

        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999);
        //arrayList.remove(0);
        //arrayList.remove(500000);
        arrayList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime +" ns");

    }
}
