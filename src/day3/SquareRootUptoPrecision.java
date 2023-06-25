package day3;

public class SquareRootUptoPrecision {
    public static void main(String[] args) {
        /*
         * sqrt(11) = 3.xyzabc.....
         * You have to find sqrt upto 6th
         * decimal place or accuracy upto
         * 10^(-6)
         */
        int num = 83;
        int precision = 6;
        double result = preciseSquareRoot(num, precision);
        System.out.println("result is : " + result);

    }

    /**
     * TC : O(log n + log(10^precision))
     * : O(log n + precision * log10)
     * : O(log n + precision)
     * : O(log n)
     * 
     * SC : O(1)
     * 
     */
    private static double preciseSquareRoot(int num, int j) {
        int integralPart = getIntergralPart(num);
        System.out.println("integral part : " + integralPart);
        System.out.println("Better approach");
        long betterIntegralPart = getBetterIntegralPart(num);
        System.out.println("integral part of square root : " + betterIntegralPart);
        double precision = Math.pow(10, -j);
        double l = betterIntegralPart;
        double r = betterIntegralPart + 1;
        double mid;
        double midSqr;
        double ans = 0;
        int innerItr = 0;
        while (l <= r) {
            innerItr++;
            mid = (l + r) / 2.0;
            midSqr = mid * mid;
            if (midSqr <= num) {
                ans = mid;
                l = mid + precision;
            } else {
                r = mid - precision;
            }
        }
        System.out.println("inner iterations :: " + innerItr);
        return ans;
    }

    /**
     * TC : O(logn)
     * SC : O(1)
     */
    private static long getBetterIntegralPart(long num) {
        System.out.println("value passed to the method :: " + num);
        long l = 1;
        long r = num;
        long mid;
        long midSqr;
        long ans = 0;
        long itr = 1;
        while (l <= r) {
            itr++;
            mid = (l + r) / 2;
            midSqr = mid * mid;
            if (midSqr == num) {
                ans = mid;
                break;
            }
            if (midSqr < num) {
                l = mid + 1;
                ans = mid;
            } else {
                r = mid - 1;
            }
        }
        System.out.println("Iterations performed :: " + itr);
        System.out.println("integral part of square root :: " + ans);
        return ans;
    }

    /*
     * TC : O(sqrt(n))
     * SC : O(1)
     */
    private static int getIntergralPart(int num) {
        int ans = 1;
        int itr = 0;
        for (int i = 1; i < num; i++) {
            itr++;
            if (i * i <= num) {
                ans = i;
            } else {
                break;
            }
        }
        System.out.println("iteration :: " + itr);
        return ans;
    }

}
