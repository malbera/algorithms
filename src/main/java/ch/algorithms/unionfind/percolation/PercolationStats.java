package ch.algorithms.unionfind.percolation;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {

    private double [] mean;
    private int trials;

    public PercolationStats(int n, int trials) {
        this.trials = trials;
        int pow = n * n;
        this.mean = new double[trials];
        for (int i=0; i<trials; i++) {
            Percolation p = new Percolation(n);
            while (!p.percolates()) {
                int a = StdRandom.uniform(1, n+1);
                int b = StdRandom.uniform(1, n+1);
                p.open(a, b);
            }
            mean[i] = (double) p.numberOfOpenSites() / pow;
        }

    }

    public double mean() {
        return StdStats.mean(mean);
    }

    public double stddev() {
        return StdStats.stddev(mean);
    }

    public double confidenceLo() {
        return mean() - 1.96 * stddev() / Math.sqrt(trials);
    }

    public double confidenceHi() {
        return mean() + 1.96 * stddev() / Math.sqrt(trials);
    }

}
