package ch.algorithms.sorting.shell;

public class Shell {

    public static int [] sort(int [] arr) {
        int size = arr.length;
        int h = 1;

        while (h < size / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < size; i++) {
                for (int j = i; j >= h && arr[j] < arr[j - h]; j -= h) {
                    swap(arr, j, j - h);
                }
            }
            h = h / 3;
        }

        return arr;
    }

    static void swap(int [] arr, int a, int b) {
        int swp = arr[a];
        arr[a] = arr[b];
        arr[b] = swp;
    }
}
