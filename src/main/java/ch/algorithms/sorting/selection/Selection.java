package ch.algorithms.sorting.selection;

public class Selection {

    static int [] sort(int [] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
        return arr;
    }

    static void swap(int [] arr, int a, int b) {
        int swp = arr[a];
        arr[a] = arr[b];
        arr[b] = swp;
    }
}
