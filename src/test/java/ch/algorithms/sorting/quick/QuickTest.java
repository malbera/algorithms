package ch.algorithms.sorting.quick;

import org.junit.Assert;
import org.junit.Test;

public class QuickTest {

    @Test
    public void sort() {
        int[] arr = {5, 3, 1, 4, 2};
        Quick.sort(arr, 0, arr.length - 1);
        Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5}, arr);
    }
}