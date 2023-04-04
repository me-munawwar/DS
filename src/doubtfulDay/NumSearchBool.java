package doubtfulDay;

public class NumSearchBool {
    public static void main(String[] args) {
        /*
         * you are given an integerr array of size n and an integer x. Check if x esist
         * in the array or not
         * 
         */
        int[] arr = { 1, 2, 35, 6, 5, 9, 6, 8 };
        int x = 3;
        System.out.println(search(arr, arr.length, x));
    }

    private static boolean search(int[] arr, int length, int x) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == x)
                return true;
        }
        return false;
    }
    /*
     * Time complexity : O(n)
     * Space complexity : O(1)
     */
}
