package searching.binarysearch;

import java.util.Arrays;

public class BinarySearch {

    private static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // 찾지 못했을 경우
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 10, 6, 7, 1, 5, 9, 2, 8};
        int target = 5;
        int invalidTarget = 11;

        Arrays.sort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        System.out.println("Index of value " + target + ": " + search(arr, target));
        System.out.println("Index of value " + invalidTarget + ": " + search(arr, invalidTarget));
    }
}
