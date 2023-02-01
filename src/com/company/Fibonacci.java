package com.company;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 100;
        long[] memory = new long[n + 1];
        Arrays.fill(memory, -1);

        // System.out.println(fibonacciS(100));
        System.out.println(fibonacciF(100));
        System.out.println(fibonacciM(n, memory));
    }

    // slow
    private static long fibonacciS(int n) {
        if (n <= 1) return n;
        return fibonacciS(n - 1) + fibonacciS(n - 2);
    }

    // memorise
    private static long fibonacciM(int n, long[] memory) {
        if (memory[n] != -1) return memory[n];
        if (n <= 1) return n;
        long result = fibonacciM(n - 1, memory) + fibonacciM(n - 2, memory);
        memory[n] = result;
        return result;
    }

    // fast
    // O(n + n) => O(2n) => O(n)
    private static long fibonacciF(int n) {
        long[] array = new long[n + 1]; // O(n)
        array[0] = 0; // O(1)
        array[1] = 1; // O(1)

        for (int i = 2; i <= n; i++) { // O(n)
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n]; // O(1)
    }
}
