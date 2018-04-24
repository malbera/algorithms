package ch.algorithms.sorting.merge;

import static ch.algorithms.sorting.merge.MergeCommon.merge;

public class BottomUpMergeSort {

    public static void sort(Comparable [] a) {
        Comparable[] aux;
        int N = a.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz += sz) {
            for (int lo = 0; lo < N - sz; lo += sz + sz) {
                merge(a, aux, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
            }
        }
    }

}
