package ch.algorithms.sorting.selection;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionTest {

    @Test
    public void sort() {
        Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5}, Selection.sort(new int[] {5, 3, 1, 4, 2}));
    }
}