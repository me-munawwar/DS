package doubtfulDay;

public class NumSearchPosition {
    public static void main(String[] args) {
        /*
         * you are given an integerr array of size n and an integer x. Check if x esist
         * return its position, else return -1
         * 
         */
        int[] arr = { 1, 5, 6, 4, 7, 12, 2, 8, 9, 14, 3 };
        int x = 10;
        System.out.println(search(arr, arr.length, x));
    }

    private static int search(int[] arr, int length, int x) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    /*
     * Time complexity: O(n)
     * Space complexity:O(1)
     */
}
