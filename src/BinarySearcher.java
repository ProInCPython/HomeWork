class BinarySearcher<T extends Comparable<T>> {
    private T[] a;

    public BinarySearcher(T[] words) {
        a = words;
    }

    public int binarySearch(T key, int low, int hi) {
        if (low > hi) throw new IllegalArgumentException("Low > hi!");
        if (low < 0 || hi >= a.length) throw new IllegalArgumentException("Incorrect indexes");
        int mid = 0;
        int iters = 0;
        while (low <= hi) {
            ++iters;
            mid = (low + hi) / 2;
            T value = a[mid];
            if (value.equals(key)) {
                //System.out.println(iters);
                return mid;
            }
            if (key.compareTo(value) > 0) low = mid + 1;
            else hi = mid - 1;

        }
        //System.out.println(iters);
        return -(low + 1);
    }
}
