import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 0, если хотите получить ответ без использования массива и 1 в противном случае: ");
        int flag = in.nextInt();
        if (flag == 1) {
            int s = in.nextInt();
            int[] numbers = new int[s];
            for (int i = 0; i < s; i++) {
                numbers[i] = in.nextInt();
            }
            int min = 1_000_000_000;
            for (int i : numbers) {
                if (i > 0 && i < min) {
                    min = i;
                }
            }
            System.out.println(min);
        } else {
            int min = 1_000_000_000;
            int n = in.nextInt();
            for (int i = 1; i <= n; ++i) {
                int number = in.nextInt();
                if (number > 0 && number < min) {
                    min = number;
                }
            }
            System.out.println(min);
        }
    }
}
