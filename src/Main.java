public class Main {
    public static void main(String[] args) {
        Trinity<Integer> trinity = new Trinity<>(9, 8, 7);
        System.out.println(trinity.getFirst());
        System.out.println(trinity.getSecond());
        System.out.println(trinity.getThird());
    }
}
