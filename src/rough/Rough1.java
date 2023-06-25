package rough;

public class Rough1 {
    public static void main(String[] args) {
        int a = 10;
        int b = -10;
        System.out.println("Find greatest common devisor for " + a + " and " + b);
        printGCD(a, b);
    }

    private static int printGCD(int a, int b) {
        int min = Math.min(a, b);
        while (min > 0) {
            if (a % min == 0 && b % min == 0) {
                System.out.println(min);
                break;
            }
        }
        return min;
    }
}
