import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int rabbits = 11;
        int wolves = 2;
        int eaten_rabbits = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; ++i) {
            if (i % 2 != 0) {
                rabbits *= 3;
                if (rabbits > 19000000) {
                    rabbits = 19000000;
                }
            } else {
                if (wolves * 10 > rabbits) {
                    int wolves_deduction = ((wolves * 10 - rabbits)) / 10 + 1;
                    wolves -= wolves_deduction;
                    rabbits -= wolves * 10;
                    eaten_rabbits += wolves * 10;
                } else {
                    rabbits -= wolves * 10;
                    eaten_rabbits += wolves * 10;
                }
            }
            if (eaten_rabbits >= 70) {
                wolves += 1;
                eaten_rabbits -= 70;
            }
        }
        System.out.println(rabbits);
        System.out.println(wolves);
    }
}
