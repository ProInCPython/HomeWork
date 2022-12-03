
public class Trinity<T extends Comparable<T>> {

    T first;
    T second;
    T third;

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public Trinity(T a, T b, T c) {
        this.first = a;
        this.second = b;
        this.third = c;
        int f_s = a.compareTo(b);
        int f_t = a.compareTo(c);
        int s_t = b.compareTo(c);
        T tmp;
        if (f_s < 0) {
            tmp = first;
            first = second;
            second = tmp;
        }
        if (f_t < 0) {
            tmp = second;
            second = third;
            third = tmp;
        }
        if (s_t < 0) {
            tmp = third;
            third = second;
            second = tmp;
        }
    }
}
