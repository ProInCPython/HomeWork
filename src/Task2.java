import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n % 10 == 0) {
            n /= 10;
        }
        if (n < 0) {
            n -= n * 2;
            String result = "";
            while (n != 0) {
                result += n % 10;
                n /= 10;
            }
            System.out.println("-" + result);
        } else {
            String result = "";
            while (n != 0) {
                result += n % 10;
                n /= 10;
            }
            System.out.println(result);
        }
    }
}
