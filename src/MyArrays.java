import java.util.Scanner;

public class MyArrays {
    public static double AvgOf4Digit(int[] a) {
        double counter = 0.00;
        double sum_of = 0.00;
        for (int i : a) {
            if (i > 999 && i < 10_000) {
                counter += 1;
                sum_of += i;
            }
        }
        if (counter == 0.00) {
            return -1.00;
        } else {
            return sum_of / counter;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        System.out.println(AvgOf4Digit(a));
    }
}
