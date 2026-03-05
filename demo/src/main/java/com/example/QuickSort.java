package com.example;
import java.util.Arrays;
public class QuickSort {
    // Public method (clean API)
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // nothing to sort
        }
        quickSort(arr, 0, arr.length - 1);
    }

    // Recursive QuickSort
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition method
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    // Swap helper method
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        quickSort(arr);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }

}
