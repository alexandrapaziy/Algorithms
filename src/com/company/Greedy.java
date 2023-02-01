package com.company;

import java.util.Arrays;

public class Greedy {
    public static void main(String[] args) {
        int[] digits = {3, 1, 7, 9, 9, 5};
        System.out.println(maxNumFromDig(digits));

        int[] stations = {0, 200, 375, 550, 750, 950};
        int capacity = 400;
        System.out.println(minStops(stations, capacity));
    }

    public static String maxNumFromDig(int[] digits) {
        Arrays.sort(digits);

        String result = "";
        for (int i = digits.length - 1; i >= 0; i--) {
            result += digits[i];
        }
        return result;
    }

    // returns -1 if it`s impossible to get from A to B
    public static int minStops(int[] stations, int capacity) {
        int result = 0;
        int currentStop = 0;
        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;
            while (nextStop < stations.length - 1 &&
                    stations[nextStop + 1] - stations[currentStop] <= capacity) {
                nextStop++;
            }
            if (currentStop == nextStop) {
                return -1;
            }

            if (nextStop < stations.length - 1) {
                result++;
            }

            currentStop = nextStop;
        }
        return result;
    }
}
