public class Problem0 {
    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println(fact);
    }

    private static int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial(--i);
    }
}
