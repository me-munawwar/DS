package day2.binarySearch;

public class NumberFrequencyInArray {
    public static void main(String[] args) {
        /*
         * You have a sorted array of integers and you have multiple
         * queries.
         * In each query you have been given an integer x, you have to
         * print the frequency of that integer x.
         * n = 10, arr = {1,2,3,3,4,4,6,6,8,9}
         * Q = [
         * 3 => 2
         * 4 => 2 2
         * 8 => 1
         * 9 => 1
         * 10 => 0
         * ]
         */
        int[] arr = { 1, 2, 3, 3, 4, 4, 6, 6, 8, 9 };
        int[] Q = { 3, 4, 8, 9, 10 };
        frequencyOfInteger(arr, arr.length, Q, Q.length);
    }

    private static int frequencyOfInteger(int[] arr, int length, int[] Q, int q) {
        for (int i = 0; i < q; i++) {
            int firstOccurence = NumSearchByOccurence.binarySearchFirstOccurence(arr, length, Q[i]);
            int lastOccurence = NumSearchByOccurence.binarySearchLastOccurence(arr, length, Q[i]);
            int frequency = 0;
            if (firstOccurence != -1) {
                frequency = lastOccurence - firstOccurence + 1;
            }
            System.out.println("frequency of " + Q[i] + " : " + frequency);
        }
        return 0;
    }
}
