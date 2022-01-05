package com.example.CodePractice.DataStructureAlgorithm.InsertionSort;

// Insertion sort =
//              start from the second element, use temp to store the value
//              check each element at the left of temp, compare the elements with temp.
//				shift all elements>temp to the right of temp until the next element is smaller than temp

//				Quadratic time O(n^2)
//				small data set = decent
//				large data set = BAD

//				Less steps than Bubble sort
//				Best case is O(n) compared to Selection sort O(n^2)


public class Main {

    public static void main(String[] args) {

        int array[] = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        insertionSort(array);

        for(int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array) {

        for(int i = 1; i < array.length; i++) { //i starts from the "Second" element
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j]; //shift the element which is greater than temp to the right for one cell
                j--;
            }
            array[j + 1] = temp; //it's j+1 since j-- before exiting the for loop above
        }
    }
}
