package sorting.countingsort;

import java.util.Arrays;

public class CountingSort {

    private static void sort(int[] arr) {
        System.out.println("--- Counting Sort ---");
        System.out.println("Before: " + Arrays.toString(arr));

        int n = getMax(arr);
        int[] output = new int[arr.length];
        int[] counter = new int[n + 1];

        for (int i : arr){
            counter[i]++;
        }

        for (int i = 1; i < counter.length; i++) {
            counter[i] += counter[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[--counter[arr[i]]] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }

        System.out.println("After: " + Arrays.toString(arr));
    }

    private static int getMax(int[] arr) {
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result = Math.max(arr[i], result);
        }

        return result;
    }

    public static void main(String[] args) {
//        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr = {3, 9, 6, 1, 10, 5, 2, 8, 7, 4};
        sort(arr);
    }
}
