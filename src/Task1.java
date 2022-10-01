import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int first = 1;
        int second = 1;
        if (n <= 2) {
            System.out.println(1);
        }
        else {
            int memory;
            for (int i = 3; i <= n; ++i) {
                memory = second;
                second = first + memory;
                first = memory;
            }
            System.out.println(second);
        }
    }
}
