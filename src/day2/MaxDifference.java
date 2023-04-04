package day2;

public class MaxDifference {
    public static void main(String[] args) {
        /*
         * Maximum difference between two elements such that larger element appears
         * after the smaller number
         * {2,3,10,6,4,8,1} --> 2-10 = |8|
         * {7,9,5,6,3,2} --> 7-9 = |2|
         */
        int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
        int maxDiff = maxDiff(arr, arr.length);
        int betterMaxDiff = betterMaxDiff(arr, arr.length);
        System.out.println("Better maxDiff :: " + betterMaxDiff);
        System.out.println("maxDiff :: " + maxDiff);
    }

    /*
     * T.C : O(n)
     * S.C : O(1)
     * 
     * Approach 2 : Better
     */
    private static int betterMaxDiff(int[] arr, int length) {
        int minimumBefore = arr[0];
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 1; i < length; i++) {
            if (arr[i] - minimumBefore > maxDiff) {
                maxDiff = arr[i] - minimumBefore;
                minimumBefore = Math.min(minimumBefore, arr[i]);
            }
        }
        return maxDiff;
    }

    /**
     * Time complexity : O(n*n)
     * Space complexity : O(1)
     * 
     * Approach 1
     */
    private static int maxDiff(int[] arr, int length) {
        int maxDiff = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[j] > arr[i]) {
                    if (arr[j] - arr[i] > maxDiff) {
                        maxDiff = arr[j] - arr[i];
                    }
                }
            }
        }
        return maxDiff;
    }

}
