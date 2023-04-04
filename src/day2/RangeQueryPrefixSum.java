package day2;

public class RangeQueryPrefixSum {
    public static void main(String[] args) {
        /*
         * Range Query - Prefix Sum
         * Let's say you are given an array of n integers.
         * And someone is asking you Q queries on that.
         * Each query is in the form of an integer pair [L,R]
         * such that 0<=L<=R<n
         * You have to print sum of elements of the array
         * for each query which are between indices L to R
         * (inclusive)
         * n = 6, arr = {5,2,1,3,2,1}
         * Q = {
         * [0,2] ==> > 8
         * [1,2] => 3
         * [3,4] => 5
         * [4,4] => 2
         * [1,4] => 8
         * 
         */
        int[] arr = { 5, 2, 1, 3, 2, 1 };
        int[][] Q = { { 0, 2 }, { 1, 2 }, { 3, 4 }, { 4, 4 }, { 1, 4 } };
        solve(arr, arr.length, Q, Q.length);
        System.out.println();
        System.out.println();
        System.out.println("Better Solve");
        betterSolve(arr, arr.length, Q, Q.length);
    }

    /*
     * TC : O(n+q)
     * SC : O(n)
     */
    private static void betterSolve(int[] arr, int n, int[][] Q, int q) {
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = arr[i] + prefixSum[i - 1];
        }
        for (int i = 0; i < q; i++) {
            int L = Q[i][0];
            int R = Q[i][1];
            int sumLtoR = prefixSum[R] - prefixSum[L] + arr[L];
            System.out.println(sumLtoR);
        }
    }

    /*
     * TC : O(Q*(R-L) --> similar to O(n*q)
     * SC : O(1)
     */
    private static void solve(int[] arr, int length, int Q[][], int q) {
        for (int i = 0; i < q; i++) {
            int L = Q[i][0];
            int R = Q[i][1];
            int sum = 0;
            for (int j = L; j <= R; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
        }

    }
}
