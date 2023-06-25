package day3.recursion;

public class PrintNtoOne {
    public static void main(String[] args) {
        printNtoOne(10);
    }

    /*
     * TC : O(n)
     * SC : O(n)
     */
    private static void printNtoOne(int i) {
        if (i == 1) {
            System.out.println(i);
            return;
        }
        System.out.println(i);
        printNtoOne(i - 1);
    }
}
