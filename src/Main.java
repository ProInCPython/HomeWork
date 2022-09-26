import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int last = n % 10;
        int first = n / 100;
        int middle = (n / 10) % 10;
        System.out.print(last + first + middle);
        System.out.print(" ");
        System.out.print(n + (2 - (n % 2)));
    }
}