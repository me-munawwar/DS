package day1;

public class Problem2 {
    public static void main(String[] args) {
        /*
         * Theorem: If you start with any posotive number in this world and follow these
         * steps
         * recursively/repeatingly.
         * If n is even n = n/2;
         * else n 3*n+1;
         * Then your n will convert to 1 in finite number of steps.
         * n = 1
         * n = 2 -> 1
         * n = 3 > 10 > 5 > 16 -> 8 -> 4> 2 -> 1
         * n=4> 2 -> 1
         * n = 5 16 -> 8 -> 4> 2 -> 1
         */

        int count = numberFoStepsTaken(5);
        System.out.println(count);
    }

    private static int numberFoStepsTaken(int i) {
        if (i == 1) {
            return i;
        }

        if (i % 2 == 0)
            return 1 + numberFoStepsTaken(i / 2);
        else
            return 1 + numberFoStepsTaken((3 * i + 1));

    }
}
