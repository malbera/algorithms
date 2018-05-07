package ch.algorithms.sorting.insertion;

public class Insertion {

    public static int [] sort(int [] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1])  {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }

        return arr;
    }

    static void swap(int [] arr, int a, int b) {
        int swp = arr[a];
        arr[a] = arr[b];
        arr[b] = swp;
    }
}
