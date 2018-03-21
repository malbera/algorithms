package ch.algorithms.sorting.bubble;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleTest {

    @Test
    public void sort_1() {
        assertArrayEquals(new int [] {1,2,3,5}, Bubble.sort(new int[] {5,3,1,2}));
    }

    @Test
    public void sort_2() {
        assertArrayEquals(new int [] {1,2,3,5,5,6,7,8,10}, Bubble.sort(new int[] {1,5,5,3,6,10,8,7,2}));
    }
}