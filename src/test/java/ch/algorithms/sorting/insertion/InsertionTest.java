package ch.algorithms.sorting.insertion;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionTest {

    @Test
    public void sort() {
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, Insertion.sort(new int[] {5, 3, 1, 4, 2}));
    }
}