
public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        String[] array = new String[]{"a", "b", "c", "d", "e"};
        list.addAll(array);
        System.out.println(list.contains("yyrert"));
        System.out.println(list.indexOf("f"));
    }
}



