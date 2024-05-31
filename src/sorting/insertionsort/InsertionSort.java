package sorting.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] arr) {
        System.out.println("--- Insertion Sort ---");
        System.out.println("Before: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int prevIdx = i - 1;

            while (prevIdx >= 0 && arr[prevIdx] > temp) {
                arr[prevIdx + 1] = arr[prevIdx];
                prevIdx--;
            }

            arr[prevIdx + 1] = temp;
        }

        System.out.println("After: " + Arrays.toString(arr) + "\n");
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 10, 6, 7, 1, 5, 9, 2, 8};
        sort(arr);
    }
}
