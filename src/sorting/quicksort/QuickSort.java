package sorting.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] arr) {
        System.out.println("--- Quick Sort --- ");
        System.out.println("Before: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After: " + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = partition(arr, left, right);
        quickSort(arr, left, mid);
        quickSort(arr, mid + 1, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];

        while (left < right) {
            while (arr[left] < pivot) {
                left++;
            }

            while (arr[right] > pivot) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return left;
    }

    public static void main(String[] args) {
//        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr = {3, 9, 6, 1, 10, 5, 2, 8, 7, 4};
        sort(arr);
    }
}
