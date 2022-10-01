import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = n % 10;
        n /= 10;
        while (n != 0) {
            if (n % 10 < min && n % 10 != 0) {
                min = n % 10;
            }
            n /= 10;
        }
        System.out.println(min);
    }
}
