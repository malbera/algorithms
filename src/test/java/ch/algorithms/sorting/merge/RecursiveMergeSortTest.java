package ch.algorithms.sorting.merge;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RecursiveMergeSortTest {

    @Test
    public void sort() {
        String [] array =  new String [] {"G", "S", "E", "P", "A", "K"};
        RecursiveMergeSort.sort(array);
        Assert.assertEquals("AEGKPS", Stream.of(array).collect(Collectors.joining()));
    }
}