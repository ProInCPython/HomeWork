import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 2 * n + 1;
        int a[][] = new int[x][x];
        a[n][n] = 0;
        int current = 1;
        int i = n;
        int j = n;
        int left_steps = 1;
        int steps = 2;
        while (current <= x * x - 1) {
            i -= 1;
            a[i][j] = current;
            current += 1;
            for (int k = 1; k <= left_steps; ++k) {
                j -= 1;
                a[i][j] = current;
                current += 1;
            }
            left_steps += 2;
            for (int k = 1; k <= steps; ++k) {
                i += 1;
                a[i][j] = current;
                current += 1;
            }
            for (int k = 1; k <= steps; ++k) {
                j += 1;
                a[i][j] = current;
                current += 1;
            }
            for (int k = 1; k <= steps; ++k) {
                i -= 1;
                a[i][j] = current;
                current += 1;
            }
            steps += 2;
        }
        for (int r = 0; r < a.length; r++) {
            for (int d = 0; d < a[r].length; d++) {
                System.out.print(a[r][d] + "\t");
            }
            System.out.println();
        } // Извините за корявое решение, но, если честно, уже голова не варит)))
    }
}
