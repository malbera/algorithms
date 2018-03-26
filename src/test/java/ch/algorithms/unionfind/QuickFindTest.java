package ch.algorithms.unionfind;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickFindTest {

    @Test
    public void isConnectedTest() {
        QuickFind find = new QuickFind(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        find.union(2, 3);
        find.union(2, 1);
        find.union(0, 4);
        find.union(5, 6);
        find.union(7, 8);
        find.union(7, 9);
        find.union(5, 9);
        assertTrue(find.isConnected(5,7));
        assertTrue(find.isConnected(1,3));
        assertTrue(find.isConnected(0,4));
        assertFalse(find.isConnected(1,9));
    }

}