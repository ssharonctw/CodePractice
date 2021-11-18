package com.example.CodePractice.DataStructureAlgorithm.DynamicArray;

import java.util.Iterator;

public class MyArray <T> implements Iterable<T>{
    private T[] arr;
    private int len = 0; // length user thinks the array is
    private int capacity = 0; // the actual array size

    //constructor1 taking no parameters
    public MyArray(){
        this(16); //calling the constructor2 and set the capacity to 16
    }

    //constructor2 taking int as array size
    public MyArray(int capacity){
        len = capacity;
        this.capacity = capacity;
        arr = (T[])new Object[capacity];
    }


    @Override //a function called iterator() that would return an iterator<T> type
    public Iterator<T> iterator() {

        return new MyIterator();
        //the above with the MyIterator class definition
        //is equivalent to the below implicit anonymous class
        /*
        return new Iterator<T> (){
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < len;
            }

            @Override
            public T next() {
                return arr[index++];
            }
        };
        */
    }

    private class MyIterator implements Iterator<T> {
        int index =0 ;
        @Override
        public boolean hasNext() {
            return index < len;
        }

        @Override
        public T next() {
            return arr[index++];
        }
    }

}
