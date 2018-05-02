package ch.algorithms.search;

public class BinarySearch {

    public int search(int [] array, int value) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = (high + low) >>> 1;
            if (array[mid] < value) low = mid + 1;
            else if (array[mid] > value) high = mid - 1;
            else return mid;
        }
        return -1;
    }
}
