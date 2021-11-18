package com.example.CodePractice.DataStructureAlgorithm.LinkedLists;

/*
LinkedList is a long chain of nodes, the nodes can be at random places in memory
unlike arrays are always contagious memory spaces
each node knows the clue of the next node,
for one node in which it's next node is "null" it's the end of the list


Pros:
- indertion and deletion of Node is easy as don't need to shift the entire list when inserting O(1)
- dynamic data structure (allocate needed memory when running), low memory waste
cons:
- Greater memory usage as needs to store pointer
- is hard to search O(n), array can use index to access an element, but linkedlist cannot (no random access)

Usage:
1. implement stack/queues
2. GPS navigation (from node to node)
3. music playlist

single linkedlist: each node only know the next
doubly linkedlist: each node knows the next and the previous, but it consumes more memory
 */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<>();
        /*in the LinkedList definition
        there's:
        - size
        - first: pointer to the first node
        - last: pointer to the last node
        - Node: an inner class
               - item
               - Node next
               - Node prev
        * */


        //treating linkedlist like stack, LIFO
        linkedList.push("A");   // A
        linkedList.push("B");   // B A
        linkedList.push("C");   // C B A
        linkedList.push("D");   // D C B A
        linkedList.push("E");   // E D C B A
        linkedList.pop();          // D C B A
        System.out.println(linkedList);

        //treating linkedlist like queue, FIFO
        linkedList.offer("A");  // D C B A A
        linkedList.offer("B");  // D C B A A B
        linkedList.offer("C");  // D C B A A B C
        linkedList.offer("D");  // D C B A A B C D
        linkedList.offer("E");  // D C B A A B C D E
        linkedList.poll();         // C B A A B C D E
        System.out.println(linkedList);


        linkedList.add(4, "E"); //will get add to index 4 (index starts from 0)
        System.out.println(linkedList);
        linkedList.remove("A"); //will remove the elements that are find first (not removeing all matching elements)
        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

    }

}
