package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] arr) {
        System.out.println("--- Merge Sort ---");
        System.out.println("Before: " + Arrays.toString(arr));
        mergeAndSort(arr, 0, arr.length - 1);
        System.out.println("After: " + Arrays.toString(arr));
    }

    private static void mergeAndSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;
        mergeAndSort(arr, left, mid);
        mergeAndSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        final int[] L = Arrays.copyOfRange(arr, left, mid + 1);
        final int[] R = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int l = 0;
        int r = 0;
        int i = left;

        while (l < L.length && r < R.length) {
            if (L[l] <= R[r]) {
                arr[i++] = L[l++];
            } else {
                arr[i++] = R[r++];
            }
        }

        while (l < L.length) {
            arr[i++] = L[l++];
        }

        while (r < R.length) {
            arr[i++] = R[r++];
        }
    }

    public static void main(String[] args) {
//        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr = {3, 9, 6, 1, 10, 5, 2, 8, 7, 4};
        sort(arr);
    }
}
