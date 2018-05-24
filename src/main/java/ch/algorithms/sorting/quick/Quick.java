package ch.algorithms.sorting.quick;

public class Quick {

    public static void sort(int[] arr, int lo, int hi) {
        if (hi <= lo) return;
        int p = partition(arr, lo, hi);
        sort(arr, lo, p - 1);
        sort(arr, p + 1, hi);
    }

    static int partition(int[] arr, int lo, int hi) {
        int i = lo, j = hi + 1;
        while (true) {
            while (less(arr[++i], arr[lo])) {
                if (i == hi) {
                    break;
                }
            }
            while (less(arr[lo], arr[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(arr, i, j);
        }
        swap(arr, lo, j);
        return j;
    }

    static boolean less(int a, int b) {
        return a < b;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
