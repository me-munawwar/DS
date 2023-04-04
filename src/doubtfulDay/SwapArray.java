package doubtfulDay;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        /*
         * you are given an integerr array of size n and an integer x. Check if x esist
         * return its position, else return -1
         * 
         * if there are multiple occurenences of x, return the last one.
         */

        int[] arr = { 1, 5, 6, 4, 7, 12, 2, 8, 9, 14, 6 };
        int[] brr = swap(arr, arr.length);
        System.out.println(Arrays.toString(brr));
    }

    /*
     * T.C : O(n)
     * S.C : O(1)
     */
    private static int[] swap(int[] arr, int length) {
        for (int i = 0; i < length / 2; i++) {
            int left = i;
            int right = length - i - 1;
            if (arr[left] != arr[right]) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }
}
