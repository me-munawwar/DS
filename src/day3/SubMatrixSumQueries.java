package day3;

public class SubMatrixSumQueries {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4, 6 },
                { 5, 3, 8, 1, 2 },
                { 4, 6, 7, 5, 5 },
                { 2, 4, 8, 9, 4 }
        };

        // int Q[][] = {
        // { 0, 0, 1, 1 }, // -> 11
        // { 2, 2, 3, 4 }, // -> 38
        // { 1, 2, 3, 3 }, // -> 38
        // };

        int[] x1 = { 0, 2, 1 };
        int[] x2 = { 0, 2, 2 };
        int[] y1 = { 1, 3, 3 };
        int[] y2 = { 1, 4, 3 };
        solve(4, 5, mat, 4, x1, x2, y1, y2);
    }

    public static void solve(int n, int m, int mat[][], int q, int x1[], int y1[], int x2[], int y2[]) {
        for (int i = 0; i < q; i++) {
            int sum = 0;
            for (int j = x1[i]; j <= x2[i]; j++) {
                for (int k = y1[i]; k <= y2[i]; k++)
                    sum = sum + mat[j][k];
            }
            System.out.println(sum);
        }
    }
}
