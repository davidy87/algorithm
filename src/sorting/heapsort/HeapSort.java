package sorting.heapsort;

import java.util.Arrays;

public class HeapSort {

    public static void sort(int[] arr) {
        System.out.println("--- Heap Sort ---");
        System.out.println("Before: " + Arrays.toString(arr));

        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        System.out.println("Max Heap: " + Arrays.toString(arr));

        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i,0);
        }

        System.out.println("After: " + Arrays.toString(arr));
    }

    private static void heapify(int[] arr, int n, int parent) {
        int p = parent;
        int l = p * 2 + 1;
        int r = p * 2 + 2;

        if (l < n && arr[p] < arr[l]) {
            p = l;
        }

        if (r < n && arr[p] < arr[r]) {
            p = r;
        }

        if (p != parent) {
            swap(arr, p, parent);
            heapify(arr, n, p);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 10, 6, 7, 1, 5, 9, 2, 8};
//        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr);
    }
}
