package day3;

public class PerfectSquare {
    public static void main(String[] args) {
        /*
         * X, a will be perfect square of X if
         * a*a = X and a is an integer.
         * 1
         * 4 = 2*2
         * 9 = 3*3
         * 16= 4*4
         * 9*9 = 81
         */

        int num = 197;
        isPerfectSquare(num);
        System.out.println("Better approach");
        isBetterPerfectSquare(num);
    }

    private static void isBetterPerfectSquare(int num) {
        int l = 0;
        int r = num;
        int mid;
        int midSqr = 1;
        int itr = 1;
        while (l < r) {
            System.out.println("iteration count :: " + itr++);
            mid = (l + r) / 2;
            midSqr = mid * mid;
            if (midSqr == num) {
                System.out.println("yes : " + mid);
                return;
            } else if (midSqr < num) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
    }

    /*
     * TC : O(sqrt(n))
     * SC : O(1)
     */
    private static void isPerfectSquare(int num) {
        int itr = 1;
        for (int i = 1; i * i <= num; i++) {
            System.out.println("iteration count :: " + itr++);
            if (i * i == num) {
                System.out.println("yes : " + i);
                return;
            }
        }
        System.out.println("no");
    }
}
