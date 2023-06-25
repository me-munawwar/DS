package day3.recursion;

public class Factorial {
    public static void main(String[] args) {
        int num = 10;
        int factorial = factorial(num);
        System.out.println(factorial);

        int betterFactorial = betterFactorial(num, 1);
        System.out.println("better factorial : " + betterFactorial);
    }

    /*
     * TC : O(n)
     * SC : O(1) -> after compiler modifies the tail recursion
     */
    private static int betterFactorial(int num, int factorial) {
        if (num == 1) {
            return factorial;
        }
        return betterFactorial(num - 1, factorial *= num);

        /*
         * Tail recursion
         * betterFactorial(int num, int factorial) {
         * while(true) {
         * if(num == 1) {
         * retrurn factorial;
         * }
         * 
         * factorial *= num;
         * num -= 1;
         * }
         * 
         * }
         */
    }

    /*
     * TC : O(n)
     * SC : O(n)
     */
    private static int factorial(int i) {
        if (i == 1) {
            return i;
        }
        return i * factorial(i - 1);
    }
}
