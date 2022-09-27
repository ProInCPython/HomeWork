import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((y > 1 - x) && (x < 1) && ((y > 2 * x * x) || (y < 2 * x * x)) && (x > 0)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}