package sorting;

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
}
