package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class MergeSortTest {

    @Test
    public void testUnsortedArray() {
        int[] arr = {38, 27, 43, 10};
        int[] expected = {10, 27, 38, 43};

        MergeSort.mergeSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        MergeSort.mergeSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr);
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] arr = {5, 2, 8, 2, 1};
        int[] expected = {1, 2, 2, 5, 8};

        MergeSort.mergeSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr);
    }
}
   
    

