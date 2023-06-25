package day3.recursion;

public class ReduceTheNumToOne {
    public static void main(String[] args) {
        /*
         * You are given an integer n and
         * you can do these steps
         * recursively and your target is to
         * covert n to 1 in min number of
         * steps.
         * 1. If n is divisible by 2 you can do
         * n = n/2.
         * 2. If n is divisible by 3 you can
         * do n = n/3.
         * 3. you can always do n = n-1;
         */
        int num = 123;
        int stepCounter = solve(num);
        System.out.println("Steps taken :: " + stepCounter);
    }

    public static int solve(int n) {
        if (n == 1)
            return 0;
        if (n == 2 || n == 3)
            return 1;
        int ans = 1 + solve(n - 1);
        if (n % 2 == 0) {
            ans = Math.min(ans, 1 + solve(n / 2));
        }
        if (n % 3 == 0) {
            ans = Math.min(ans, 1 + solve(n / 3));
        }
        return ans;
    }
}
