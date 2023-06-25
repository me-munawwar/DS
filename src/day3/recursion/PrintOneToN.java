package day3.recursion;

public class PrintOneToN {
    public static void main(String[] args) {
        printOneToOne(10);
    }

    /*
     * TC : O(n)
     * SC : O(n)
     */
    private static void printOneToOne(int i) {
        if (i == 1) {
            System.out.println(i);
            return;
        }
        printOneToOne(i - 1);
        System.out.println(i);
    }
}
