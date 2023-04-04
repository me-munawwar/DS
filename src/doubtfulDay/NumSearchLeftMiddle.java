package doubtfulDay;

public class NumSearchLeftMiddle {
    public static void main(String[] args) {
        /*
         * you are given an integerr array of size n and an integer x. Check if x esist
         * return its position, else return -1
         * 
         * if there are multiple occurenences of x, return the middle one.
         * 
         * if there are even occurences, return the left middle one
         */

        int[] arr = { 1, 5, 6, 4, 7, 12, 2, 8, 9, 14, 6 }; // i = 2
        int x = 6;
        System.out.println(search(arr, arr.length, x));
    }

    /**
     * 
     * @param arr
     * @param length
     * @param x
     * @return
     *         Time Complexity : (n)
     *         Space Complexity : O(1)
     */
    private static int search(int[] arr, int length, int x) {
        int total = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == x) {
                total++;
            }
        }
        if (total == 0)
            return -1;

        for (int i = 0; i < length; i++) {
            int count = 0;
            if (arr[i] == x) {
                count++;
            }
            if (count == (total - 1) / 2)
                return i;
        }
        return -1;
    }
}
