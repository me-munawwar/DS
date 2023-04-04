package day2.binarySearch;

public class NumSearchIndex {
    public static void main(String[] args) {
        /*
         * you are given an integerr array of size n and an integer x. Check if x esist
         * return its position, else return -1
         * 
         */

        int[] arr = { 1, 3, 5, 7, 8, 12, 51, 67, 89, 100, 122, 125, 169, 500, 800 };
        int x = 1;
        System.out.println(binarySearch(arr, arr.length, x));
    }

    /*
     * TC = O(logn)
     * SC = O(1)
     * 
     * in case of multiple matches,
     * binary search doesn't care about the occurence, it will return the index of
     * the number it finds first of all.
     */
    private static int binarySearch(int[] arr, int n, int x) {
        int l = 0;
        int r = n - 1;
        int mid;
        int itr = 1;
        while (l <= r) {
            System.out.println("iteration : " + itr++);
            mid = (l + r) / 2;
            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
