package day2.binarySearch;

public class NumSearchByOccurence {
    public static void main(String[] args) {
        /*
         * you are given an integerr array of size n and an integer x. Check if x esist
         * return its position, else return -1
         * 
         * if there are multiple occurences of x, return the first occurence
         * 
         */

        int[] arr = { 2, 3, 3, 3, 3, 4, 4, 4, 6, 6, 8, 8, 8, 10, 12 };
        int x = 3;
        System.out.println("First occurence of " + x + " : ");
        System.out.println(binarySearchFirstOccurence(arr, arr.length, x));
        System.out.println();
        System.out.println("Last occurence of " + x + " : ");
        System.out.println(binarySearchLastOccurence(arr, arr.length, x));
    }

    /*
     * TC = O(logn)
     * SC = O(1)
     */
    public static int binarySearchFirstOccurence(int[] arr, int n, int x) {
        int l = 0;
        int r = n - 1;
        int mid;
        int itr = 1;
        while (l <= r) {
            System.out.println("Iteration : " + itr++);
            mid = (l + r) / 2;

            if ((mid == 0 || arr[mid - 1] < x) && arr[mid] == x) // condition for 1st occurence
                return mid;

            if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    // int[] arr = { 2, 3, 3, 3, 3, 4, 4, 4, 6, 6, 8, 8, 8, 10, 12 };
    public static int binarySearchLastOccurence(int[] arr, int n, int x) {
        int l = 0;
        int r = n - 1;
        int mid;
        int itr = 1;
        while (l <= r) {
            System.out.println("Iteration : " + itr++);
            mid = (l + r) / 2;

            if ((mid == n - 1 || arr[mid + 1] > x) && arr[mid] == x) // condition for last occurence
                return mid;
            if (arr[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
