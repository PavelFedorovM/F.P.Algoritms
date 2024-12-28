import java.util.Comparator;

public class Arrays {

    // Методы для типа byte

    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        if (fromIndex > toIndex || fromIndex < 0 || toIndex > a.length)
            throw new IndexOutOfBoundsException();

        while (fromIndex <= toIndex) {
            int mid = fromIndex + ((toIndex - fromIndex) / 2);
            if (a[mid] == key)
                return mid;
            else if (a[mid] < key)
                fromIndex = mid + 1;
            else
                toIndex = mid - 1;
        }
        return -(fromIndex + 1); // Возвращаем отрицательное значение индекса вставки
    }

    // Методы для типа char

    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        if (fromIndex > toIndex || fromIndex < 0 || toIndex > a.length)
            throw new IndexOutOfBoundsException();

        while (fromIndex <= toIndex) {
            int mid = fromIndex + ((toIndex - fromIndex) / 2);
            if (a[mid] == key)
                return mid;
            else if (a[mid] < key)
                fromIndex = mid + 1;
            else
                toIndex = mid - 1;
        }
        return -(fromIndex + 1); // Возвращаем отрицательное значение индекса вставки
    }

    // Методы для типа double

    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        if (fromIndex > toIndex || fromIndex < 0 || toIndex > a.length)
            throw new IndexOutOfBoundsException();

        while (fromIndex <= toIndex) {
            int mid = fromIndex + ((toIndex - fromIndex) / 2);
            if (Double.compare(a[mid], key) == 0)
                return mid;
            else if (Double.compare(a[mid], key) < 0)
                fromIndex = mid + 1;
            else
                toIndex = mid - 1;
        }
        return -(fromIndex + 1); // Возвращаем отрицательное значение индекса вставки
    }

    // Методы для типа float

    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        if (fromIndex > toIndex || fromIndex < 0 || toIndex > a.length)
            throw new IndexOutOfBoundsException();

        while (fromIndex <= toIndex) {
            int mid = fromIndex + ((toIndex - fromIndex) / 2);
            if (Float.compare(a[mid], key) == 0)
                return mid;
            else if (Float.compare(a[mid], key) < 0)
                fromIndex = mid + 1;
            else
                toIndex = mid - 1;
        }
        return -(fromIndex + 1); // Возвращаем отрицательное значение индекса вставки
    }

    // Методы для типа int

    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        if (fromIndex > toIndex || fromIndex < 0 || toIndex > a.length)
            throw new IndexOutOfBoundsException();

        while (fromIndex <= toIndex) {
            int mid = fromIndex + ((toIndex - fromIndex) / 2);
            if (a[mid] == key)
                return mid;
            else if (a[mid] < key)
                fromIndex = mid + 1;
            else
                toIndex = mid - 1;
        }
        return -(fromIndex + 1); // Возвращаем отрицательное значение индекса вставки
    }

    // Методы для типа long

    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        if (fromIndex > toIndex || fromIndex < 0 || toIndex > a.length)
            throw new IndexOutOfBoundsException();

        while (fromIndex <= toIndex) {
            int mid = fromIndex + ((toIndex - fromIndex) / 2);
            if (a[mid] == key)
                return mid;
            else if (a[mid] < key)
                fromIndex = mid + 1;
            else
                toIndex = mid - 1;
        }
        return -(fromIndex + 1); // Возвращаем отрицательное значение индекса вставки
    }

    // Методы для типа short

    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        if (fromIndex > toIndex || fromIndex < 0 || toIndex > a.length)
            throw new IndexOutOfBoundsException();

        while (fromIndex <= toIndex) {
            int mid = fromIndex + ((toIndex - fromIndex) / 2);
            if (a[mid] == key)
                return mid;
            else if (a[mid] < key)
                fromIndex = mid + 1;
            else
                toIndex = mid - 1;
        }
        return -(fromIndex + 1); // Возвращаем отрицательное значение индекса вставки
    }

    // Методы для обобщенного типа T

    public static <T extends Comparable<? super T>> int binarySearch(T[] a, T key) {
        return binarySearch(a, 0, a.length, key, null);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<T> comparator) {
        if (fromIndex > toIndex || fromIndex < 0 || toIndex > a.length)
            throw new IndexOutOfBoundsException();

        while (fromIndex <= toIndex) {
            int mid = fromIndex + ((toIndex - fromIndex) / 2);
            int cmp = (comparator != null) ? comparator.compare(a[mid], key) : ((Comparable<T>) a[mid]).compareTo(key);
            if (cmp == 0)
                return mid;
            else if (cmp < 0)
                fromIndex = mid + 1;
            else
                toIndex = mid - 1;
        }
        return -(fromIndex + 1); // Возвращаем отрицательное значение индекса вставки
    }
}