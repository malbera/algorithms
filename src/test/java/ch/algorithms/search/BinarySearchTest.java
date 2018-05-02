package ch.algorithms.search;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void search() {
        Assert.assertEquals(3, new BinarySearch().search(new int[]{1, 2, 3, 5, 7}, 5));
    }
}