package ch.algorithms.unionfind;

public class QuickFind {

    private int[] array, arraySize;

    public QuickFind(int array []) {
        this.array = array;
        this.arraySize = new int[array.length];
        for (int i=0; i<array.length; i++) {
            arraySize[i] = 1;
        }
    }

    private int getRoot(int i) {
        while (i != array[i]) {
            i = array[array[i]];
        }
        return i;
    }

    public boolean isConnected(int a, int b) {
        return getRoot(a) == getRoot(b);
    }

    public void union(int a, int b) {
        int aId = getRoot(a), bId = getRoot(b);
        if (aId == bId) return;
        if (array[aId] < array[bId]) {
            array[aId] = bId;
            arraySize[bId] += arraySize[aId];
        } else {
            array[bId] = aId;
            arraySize[aId] += arraySize[bId];
        }
    }
}
