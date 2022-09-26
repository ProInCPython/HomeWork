import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String minutes;
        String seconds;
        int n = in.nextInt();
        int hours = n / 3600;
        int minutes1 = (n - (hours * 3600)) / 60;
        if (minutes1 < 10) {
            minutes = "0" + minutes1;
        }
        else {
            minutes = "" + minutes1;
        }
        int seconds1 = (n - (hours * 3600)) - (minutes1 * 60);
        if (seconds1 < 10) {
            seconds = "0" + seconds1;
        }
        else {
            seconds = "" + seconds1;
        }
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}