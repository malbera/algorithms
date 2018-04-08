package ch.algorithms.unionfind.percolation;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

import java.util.Objects;

public class Percolation {

    private final int SIZE;
    private boolean [] opened;
    private WeightedQuickUnionUF uf;

    public Percolation(int n) {
        this.SIZE = n;
        this.uf = new WeightedQuickUnionUF(SIZE * SIZE + 2);
        this.opened = new boolean[SIZE * SIZE + 2];
    }

    public void open(int row, int col) {
        int cellIndex = getCellIndex(row, col);
        if (!opened[cellIndex]) {
            opened[cellIndex] = true;
            if (checkBottomEdge(row)) {
                uf.union(cellIndex, 0);
            } else {
                union(getCellIndex(row - 1, col), cellIndex);
            }
            if (checkTopEdge(row)) {
                uf.union(cellIndex, getCellIndex(SIZE + 1, 1));
            } else {
                union(getCellIndex(row + 1, col), cellIndex);
            }
            if (!checkBottomEdge(col)) {
                union(getCellIndex(row, col - 1), cellIndex);
            }
            if (!checkTopEdge(col)) {
                union(getCellIndex(row, col + 1), cellIndex);
            }
        }
    }

    void union(int a, int b) {
        if (opened[a]) {
            uf.union(a, b);
        }
    }

    public boolean isOpen(int row, int col) {
        return opened[getCellIndex(row, col)];
    }

    public boolean isFull(int row, int col) {
        return uf.connected(0, getCellIndex(row, col));
    }

    public int numberOfOpenSites() {
        return uf.count();
    }

    public boolean percolates() {
        return uf.connected(0, getCellIndex(SIZE + 1, 1));
    }

    int getCellIndex(int row, int col) {
        return SIZE * (row - 1) + col;
    }

    boolean checkBottomEdge(int val) {
        return 1 == val;
    }
    boolean checkTopEdge(int val) {
        return SIZE == val;
    }


}
