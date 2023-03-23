package day1;

public class Problem1 {
    public static void main(String[] args) {
        /*
         * Let's say you have an array of n integers, and you have a number X.
         * You have to find 2 elements from array whose sum is eqaul to X.
         * X = 5, arr = {4,3,1,2,5}
         * Solution: 3,2
         * X = 6, arr = {4,3,1,2,5}
         * Solution: 4,2
         * X = 11, arr = {4,3,1,2,5}
         * Solution: No Solution
         */

        int[] arr = { 4, 3, 1, 2, 5 };
        int sum = 5;
        operate(arr, arr.length, sum);
    }

    private static void operate(int[] arr, int length, int sum) {
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (arr[i] + arr[j] == sum && i != j) {
                    System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }
    }

}
