package doubtfulDay;

public class NumSearchPositionLast {
    public static void main(String[] args) {
        /*
         * you are given an integerr array of size n and an integer x. Check if x esist
         * return its position, else return -1
         * 
         * if there are multiple occurenences of x, return the last one.
         */

        int[] arr = { 1, 5, 6, 4, 7, 12, 2, 8, 9, 14, 6 };
        int x = 6;
        System.out.println(search(arr, arr.length, x));
    }

    private static int search(int[] arr, int length, int x) {
        int ans = -1;
        for (int i = 0; i < length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        return ans;
    }
}
