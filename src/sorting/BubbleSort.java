package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr) {
        System.out.println("--- Bubble Sort ---");
        System.out.println("Before: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After: " + Arrays.toString(arr) + "\n");
    }
}
