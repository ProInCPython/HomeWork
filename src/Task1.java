import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a;
        a = new int[n][m];
        int rows = 1;
        int k = 1;
        while (rows <= n - 1) {
            a[rows][k] = rows * k;
            if (k == m - 1) {
                rows += 1;
                k = 1;
            }
            else {
                k += 1;
            }
        }
    }
}
