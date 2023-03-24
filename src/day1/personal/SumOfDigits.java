package day1.personal;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = sumOfDigits(2593);
        System.out.println(sum);
    }

    private static int sumOfDigits(int i) {
        if (i <= 0) {
            return 0;
        }
        return (i % 10) + sumOfDigits(i / 10);
    }
}
