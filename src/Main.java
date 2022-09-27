import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int counter = 0;
        if ((a >= 100 && a <= 999) && a % 5 == 0) {
            counter += 1;
        }
        if ((b >= 100 && b <= 999) && b % 5 == 0) {
            counter += 1;
        }
        if ((c >= 100 && c <= 999) && c % 5 == 0) {
            counter += 1;
        }
        if (counter >= 2) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}