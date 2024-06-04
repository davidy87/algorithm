package sorting.radixsort;

import java.util.Arrays;

public class RadixSort {

    private static void sort(int[] arr) {
        System.out.println("--- Radix Sort ---");
        System.out.println("Before: " + Arrays.toString(arr));

        int max = getMax(arr);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }

        System.out.println("After: " + Arrays.toString(arr));
    }

    private static void countingSort(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] counter = new int[10];

        for (int n : arr) {
            counter[getDigit(n, exp)]++;
        }

        for (int i = 1; i < 10; i++) {
            counter[i] += counter[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int d = getDigit(arr[i], exp);
            output[--counter[d]] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    private static int getDigit(int n, int exp) {
        return (n / exp) % 10;
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
