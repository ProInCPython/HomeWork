
public class MyArrays {
    public static double AvgOf4Digit(int[] a) {
        double counter = 0.00;
        double sum_of = 0.00;
        for (int i : a) {
            if (i > 999 && i < 10_000) {
                counter += 1;
                sum_of += i;
            }
        }
        if (counter == 0.00) {
            return -1.00;
        } else {
            return sum_of / counter;
        }
    }

    public static int[] MinToBegin(int[] a) {
        int min = a[0];
        int index = 0;
        int min_index = 0;
        for (int i : a) {
            if (i < min) {
                min = i;
                min_index = index;
            }
            index += 1;
        }
        for (int i = min_index; i > 0; --i) {
            a[i] = a[i - 1];
        }
        a[0] = min;
        return a;
    }

    public static void main(String[] args) {

    }
}
