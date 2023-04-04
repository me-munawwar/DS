package day2;

public class MaxSumOfKElement {
    public static void main(String[] args) {
        /*
         * Given an array of integers of size n, our aim is to calculat the sum of k
         * consecutive element in the array
         * 
         * { 1, 5, 6, 4, 7, 12, 2, 8, 9, 14, 6 } --> 8+9+4+6 = 37
         */
        int[] arr = { 1, 5, 6, 4, 7, 12, 2, 8, 9, 2, 6 }; // --> 12+2+8+9=31
        int k = 4;
        int maxSum = maxSumOfKElement(arr, arr.length, k);
        System.out.println(maxSum);
    }

    /*
     * Time complexity : O(n - k)
     * Space complexity : O(1)
     */
    private static int maxSumOfKElement(int[] arr, int length, int k) {
        if (k > length)
            System.exit(0);

        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        int windowSum = maxSum;
        // int finalWindow = k;
        for (int i = k; i < length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            if (windowSum > maxSum) {
                maxSum = windowSum;
                // finalWindow = i;
            }

        }
        // int i = 0;
        // while (i < k) {
        // System.out.println(arr[finalWindow--]);
        // i++;
        // }
        return maxSum;
    }
}
