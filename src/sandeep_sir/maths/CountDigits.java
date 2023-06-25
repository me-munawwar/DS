package sandeep_sir.maths;

public class CountDigits {
    public static void main(String[] args) {
        int n = countDigits(97691068);
        System.out.println(n);
    }

    /**
     * 
     * @param n
     * @return digits in n
     * 
     *         TC : Theta(D) -> where D is number of digits
     *         SC : Theta(1)
     */
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
