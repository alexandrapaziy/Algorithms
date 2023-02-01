package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {-1, 3, 5, 8, 10, 15, 16, 20};
        int key = 16;
        System.out.println(binarySearch(array, key));

    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < array[middle]) {
                high = middle - 1;
            } else if (key > array[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
