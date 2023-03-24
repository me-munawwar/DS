package day1.personal;

public class MultiplyWithoutMulitiplication {
    public static void main(String[] args) {
        int result = multiply(8, 5);
        System.out.println(result);
    }

    private static int multiply(int i, int j) {
        if (i == 0 || j == 0)
            return 0;
        return i + multiply(i, --j);
    }
}
