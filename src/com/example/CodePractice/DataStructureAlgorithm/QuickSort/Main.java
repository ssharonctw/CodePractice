package com.example.CodePractice.DataStructureAlgorithm.QuickSort;

// is a divide and conquer algorithm
// quick sort = try to find the correct position of a selected pivot (using partition())
// then moves smaller elements to left of a pivot, larger element to the right of the pivot
// then do quicksort on left part and right part
//
// partition() chooses a pivot and uses j and i two pointers
// at the start, j=start and i=j-1
// when array[j] > pivot, do nothing, simply j++
// else if array[j] < pivot: i++ then swap array[i] and array[j]
// run until j reaches the end
// when j reaches the end, i++ (i now points to where pivot should be at)
// then swap array[i] with pivot

//                       run-time complexity = Best case O(n log(n))
//				   		                       Average case O(n log(n))
//				   		                       Worst case O(n^2) if already or closed to be sorted

//                       space complexity    = O(log(n)) due to recursion


public class Main {
    public static void main(String[] args){
        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        quickSort(array, 0, array.length - 1);

        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {

        if(end <= start) return; //base case: only one element

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end; j++) {
            if(array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
