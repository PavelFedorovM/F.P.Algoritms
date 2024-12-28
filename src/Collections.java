import java.util.List;
import java.util.Comparator;

public class Collections {

    // Методы для List

    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T key) {
        return binarySearch(list, key, null);
    }

    public static <T> int binarySearch(List<T> list, T key, Comparator<T> comparator) {
        if (list.isEmpty())
            return -1;

        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            int cmp = (comparator != null) ? comparator.compare(list.get(mid), key) : ((Comparable<T>) list.get(mid)).compareTo(key);
            if (cmp == 0)
                return mid;
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -(low + 1); // Возвращаем отрицательное значение индекса вставки
    }
}