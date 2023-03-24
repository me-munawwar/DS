package day1.personal;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 9, 10 };
        int sumOfArray = sumOfArray(arr, arr.length);
        System.out.println(sumOfArray);
    }

    private static int sumOfArray(int[] arr, int i) {
        if (i <= 0) {
            return 0;
        }

        return arr[--i] + sumOfArray(arr, i);
    }
}
