package day1;

public class Problem3 {
    public static void main(String[] args) {
        /*
         * let's say you have an array of n integers , and you have a number X,
         * you have to find subarrays of the array whose sum is equal to X,
         * X = 5, arr = { 1,1,4,3,2}
         * solution: 3,2
         */

        int x = 5;
        int[] arr = { 1, 1, 4, 3, 2 };
        solve(arr, arr.length, x);
    }

    private static void solve(int[] arr, int length, int x) {
        for (int start = 0; start < length; start++) {
            for (int end = start; end < length; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
                if (sum == x) {
                    System.out.println(start + ", " + end);
                }
            }
        }
    }
}
