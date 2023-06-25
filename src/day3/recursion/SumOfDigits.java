package day3.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int sumOfDigits = solve(1231);
        System.out.println("result :; " + sumOfDigits);

        System.out.println("better approach");
        int betterSumOfDigits = betterSolve(1231, 0);
        System.out.println("better result :: " + betterSumOfDigits);
    }

    /*
     * TC : O(n)
     * SC : O(1) -> compiler modifies the method
     */
    private static int betterSolve(int num, int sum) {
        if (num <= 9) {
            return sum + num;
        }
        return betterSolve(num / 10, sum += num % 10);
    }

    /*
     * TC : O(n)
     * SC : O(n)
     */
    private static int solve(int i) {
        if (i <= 9) {
            return i;
        }
        return i % 10 + solve(i / 10);
    }

}
