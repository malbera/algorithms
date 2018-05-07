package ch.algorithms.sorting.shell;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShellTest {

    @Test
    public void sort() {
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, Shell.sort(new int[] {5, 3, 1, 4, 2}));
    }
}