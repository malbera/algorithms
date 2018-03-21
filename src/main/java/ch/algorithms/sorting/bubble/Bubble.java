package ch.algorithms.sorting.bubble;

public class Bubble {

    static int [] sort(int [] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<i; j++) {
                if (array[i] < array[j]) {
                    swap(array, i, j);
                }
            }
        }
        return array;
    }

    static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
