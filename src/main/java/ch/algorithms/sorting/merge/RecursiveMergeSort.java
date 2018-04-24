package ch.algorithms.sorting.merge;

import static ch.algorithms.sorting.merge.MergeCommon.*;

public class RecursiveMergeSort {

    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = (hi + lo) >>> 1;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        if (less(a[mid], a[mid + 1])) return;
        merge(a, aux, lo, mid, hi);
    }


}
