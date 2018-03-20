package ch.algorithms.euclid;

public class Euclid {

    public static int gcd(int a, int b) {
        return a == 0 ? b : gcd((b % a), a);
    }

}
