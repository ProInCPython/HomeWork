import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(),b = in.nextInt(), n = in.nextInt();
        int rub = a * n + (b * n) / 100;
        int cop = (b * n) % 100;
        System.out.print(rub);
        System.out.print(" ");
        System.out.print(cop);
    }
}