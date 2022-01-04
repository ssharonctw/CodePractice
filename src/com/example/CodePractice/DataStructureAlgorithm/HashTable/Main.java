package com.example.CodePractice.DataStructureAlgorithm.HashTable;
import java.sql.SQLOutput;
import java.util.*;

// Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
//			   Each key/value pair is known as an Entry
//			   FAST insertion, look up, deletion of key/value pairs
// 			   Not ideal for small data sets since there will be alot of overhead, but are great with large data sets

// hashing = Takes a key and computes an integer (formula will vary based on key & data type)
//		     In a Hashtable, we use the hash % capacity to calculate an index number
//			 for example:  key.hashCode() % capacity = index

// collision = hash function generates the same index for more than one key
//			   larger hashtable = less collisions = more efficiency
//             when collision happen, the pair can still be stored in the same index location using buckets

// bucket = an indexed storage location for one or more Entries sharing the same index
//	        can store multiple Entries in case of a collision (linked similarly a LinkedList)
//          searching of an element will go to the index, then start linear search through the linkedlist of that index to find the key

// Runtime complexity: Best Case O(1)
//                     Worst Case O(n)  --- if all elements have the same index, hence all colliding into the same bucket

public class Main {
    public static void main(String args[]){
        //the initial capacity is the size of the hashtable, the larger, the less collision
        //the loadfactor shows the % of fill that will expand the hashtable
        Hashtable<Integer, String> table = new Hashtable<Integer, String>(10,0.75f);

        //to add an element to the hashtable, use put
        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        //to remove an element from the hashtable, use remove(key)
        table.remove(777);

        //to iterate through all keys, can use the following. table.keyset() will return all keys
        for(Integer key: table.keySet()){
            //hashcode is the value that will be further divided by the capacity (10 in this case) to yield a storing index
            //to get the value with key, use table.get(key)
            System.out.println(key.hashCode()%10+"\t"+key+"/t"+table.get(key));
        }
    }

}
