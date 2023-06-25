package sandeep_sir.maths;

public class PalindromeNumbers {
    public static void main(String[] args) {
        boolean b = isPalindrome(78875);
        System.out.println(b);
    }

    public static boolean isPalindrome(int n) {
        int copy = n;
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        if (rev == copy)
            return true;
        return false;
    }
}
