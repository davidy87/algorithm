package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr) {
        System.out.println("--- Selection Sort ---");
        System.out.println("Before: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After: " + Arrays.toString(arr) + "\n");
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 10, 6, 7, 1, 5, 9, 2, 8};
        sort(arr);
    }
}
