import sorting.BubbleSort;
import sorting.InsertionSort;
import sorting.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, 10, 6, 7, 1, 5, 9, 2, 8};
        BubbleSort.sort(arr.clone());
        SelectionSort.sort(arr.clone());
        InsertionSort.sort(arr.clone());
    }
}