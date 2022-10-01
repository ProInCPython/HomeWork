import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String result = "TORT";
        if (n % 100 >= 11 && n % 100 <= 20) {
            result += "OV";
        } else {
            switch (n % 10) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    result += "OV";
                    break;
                case 1:
                    break;
                case 2:
                case 3:
                case 4:
                    result += "A";
                    break;
            }
        }
        System.out.println(n + " " + result);
    }
}
