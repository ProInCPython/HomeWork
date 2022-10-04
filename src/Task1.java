import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String a = in.nextLine();
        String result = "";
        for(char i : n.toCharArray())
        {
            if (i != a.toCharArray()[0]) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
