import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        byte[] arr = new byte[(n / 8) + 1];
        byte mask = (byte) 1000000;
        int numberOfZeros = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < (n <= 7 ? n % 8 : 7); ++j) {
                if (in.nextBoolean()) {
                    arr[i] = (byte) (arr[i] | mask);
                }
                mask >>= 1;
            }
            mask = (byte) 1000000;
            if (n - 7 <= 0) {
                arr[i] >>= 7 - n;
                numberOfZeros = 7 - n;
            }
            n -= 7;
        }
        
        for (byte b : arr) {
            for (int j = 6 - numberOfZeros; j >= 0; --j) {
                System.out.print(((b & (1 << j)) != 0) + " ");
            }
        }
    }
}
