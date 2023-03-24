package day1.personal;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = printSum(100);
        System.out.println(sum);
    }

    private static int printSum(int i) {
        if (i == 0) {
            return i;
        }
        return i + printSum(--i);
    }
}
