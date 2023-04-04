package day2;

import java.util.Arrays;

public class RangeUpdatePrefixSum {
    public static void main(String[] args) {
        /*
         * You are given an array of size n
         * where all elements are 0 initially.
         * You are given q operations to
         * perform on this array
         * Each operations is denoted by
         * [L,R,X] => add +x to all elements
         * from L to R (inclusive in the array)
         * You just have to print the final
         * state of the array, not after each
         * query.
         * n = 6, arr = (0,0,0,0,0,0}
         * Q = [
         * [1,2,2]
         * [0,1,1]
         * [1,4,1]
         * [5,5,2]
         * [0,5,2]
         * ]
         * => { 3, 7, 6, 3, 3, 4 }
         */
        int[] arr = { 0, 0, 0, 0, 0, 0 };
        int[][] Q = {
                { 1, 2, 3 }, // { 0, 3, 3, 0, 0, 0 }
                { 0, 1, 1 }, // { 1, 4, 3, 0, 0, 0 }
                { 1, 4, 1 }, // { 1, 5, 4, 1, 1, 0 }
                { 5, 5, 2 }, // { 1, 5, 4, 1, 1, 2 }
                { 0, 5, 2 } // { 3, 7, 6, 3, 3, 4 }
        };
        update(arr, arr.length, Q, Q.length);
        System.out.println();
        System.out.println();
        System.out.println("BetterUpdate");
        betterUpdate(arr, arr.length, Q, Q.length);
    }

    /*
     * TC = O(q+n)
     * SC = O(1) OR O(n) if prefixSum[] was created
     */
    private static void betterUpdate(int[] arr, int n, int[][] Q, int q) {
        for (int i = 0; i < q; i++) {
            int L = Q[i][0];
            int R = Q[i][1];
            int X = Q[i][2];
            arr[L] += X;
            if (R + 1 < n) {
                arr[R + 1] += -X;
            }
        }
        /*
         * From here on, either take a prefixSum array, which would make SC = O(n)
         * OR
         * take prefixSum int variable keep printing it
         */

        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            System.out.print(prefixSum + ", ");
        }
    }

    /*
     * TC = O(n*q)
     * SC = O(1)
     */
    private static void update(int[] arr, int n, int[][] Q, int q) {
        for (int i = 0; i < q; i++) {
            int L = Q[i][0];
            int R = Q[i][1];
            int X = Q[i][2];
            for (int j = L; j <= R; j++) {
                arr[j] += X;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
