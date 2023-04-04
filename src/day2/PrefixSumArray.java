package day2;

import java.util.Arrays;

public class PrefixSumArray {
    public static void main(String[] args) {
        /*
         * Given an array arr[] of size n. it's prefix sum array is another array
         * perfixSum[] of same size such that the value of
         * prefixSum[i] = arr[0]+arr[1] + arr[2] + ..... arr[i], i.e sum of all the
         * elements whose index<=i
         * 
         * { 1, 5, 6, 4, 7, 12, 2, 8, 9, 14, 6 } --> { 1, 6, 12, 16, 23, ........... }
         */
        int[] arr = { 1, 5, 6, 4, 7, 12, 2, 8, 9, 14, 6 };
        System.out.println(Arrays.toString(prefixSumArray(arr, arr.length)));
    }

    /*
     * Time complexity : O(n)
     * Space complexity : O(n)
     */
    private static int[] prefixSumArray(int[] arr, int length) {
        int[] brr = new int[length];
        brr[0] = arr[0];
        int prefixSum = arr[0];
        for (int i = 1; i < length; i++) {
            prefixSum += arr[i];
            brr[i] = prefixSum;
        }
        return brr;
    }
}
