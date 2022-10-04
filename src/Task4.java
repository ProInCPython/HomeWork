import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] numbers = new int[s];
        for (int i = 0; i < s; i++) {
            numbers[i] = in.nextInt();
        }
        int current = numbers[0];
        String result = "";
        for (int i : numbers) {
            if (i > current) {
                result += i + " ";
            }
            current = i;
        }
        System.out.println(result);
    }
}
