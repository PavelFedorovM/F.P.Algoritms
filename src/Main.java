import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Примеры для класса Arrays

        // byte[]
        byte[] bytes = {10, 20, 30, 40, 50};
        int indexBytes = Arrays.binarySearch(bytes, (byte) 30);
        System.out.println("Индекс элемента 30 в массиве bytes: " + indexBytes);

        indexBytes = Arrays.binarySearch(bytes, 1, 4, (byte) 40);
        System.out.println("Индекс элемента 40 в подмассиве bytes от 1 до 4: " + indexBytes);

        // char[]
        char[] chars = {'a', 'c', 'e', 'g'};
        int indexChars = Arrays.binarySearch(chars, 'e');
        System.out.println("Индекс элемента 'e' в массиве chars: " + indexChars);

        indexChars = Arrays.binarySearch(chars, 1, 3, 'g');
        System.out.println("Индекс элемента 'g' в подмассиве chars от 1 до 3: " + indexChars);

        // double[]
        double[] doubles = {1.1, 2.2, 3.3, 4.4};
        int indexDoubles = Arrays.binarySearch(doubles, 3.3);
        System.out.println("Индекс элемента 3.3 в массиве doubles: " + indexDoubles);

        indexDoubles = Arrays.binarySearch(doubles, 1, 3, 2.2);
        System.out.println("Индекс элемента 2.2 в подмассиве doubles от 1 до 3: " + indexDoubles);

        // float[]
        float[] floats = {1.1f, 2.2f, 3.3f, 4.4f};
        int indexFloats = Arrays.binarySearch(floats, 3.3f);
        System.out.println("Индекс элемента 3.3f в массиве floats: " + indexFloats);

        indexFloats = Arrays.binarySearch(floats, 1, 3, 2.2f);
        System.out.println("Индекс элемента 2.2f в подмассиве floats от 1 до 3: " + indexFloats);

        // int[]
        int[] ints = {1, 3, 5, 7, 9};
        int indexInts = Arrays.binarySearch(ints, 5);
        System.out.println("Индекс элемента 5 в массиве ints: " + indexInts);

        indexInts = Arrays.binarySearch(ints, 1, 4, 7);
        System.out.println("Индекс элемента 7 в подмассиве ints от 1 до 4: " + indexInts);

        // long[]
        long[] longs = {100L, 200L, 300L, 400L};
        int indexLongs = Arrays.binarySearch(longs, 300L);
        System.out.println("Индекс элемента 300L в массиве longs: " + indexLongs);

        indexLongs = Arrays.binarySearch(longs, 1, 3, 200L);
        System.out.println("Индекс элемента 200L в подмассиве longs от 1 до 3: " + indexLongs);

        // short[]
        short[] shorts = {10, 20, 30, 40};
        int indexShorts = Arrays.binarySearch(shorts, (short) 30);
        System.out.println("Индекс элемента 30 в массиве shorts: " + indexShorts);

        indexShorts = Arrays.binarySearch(shorts, 1, 3, (short) 20);
        System.out.println("Индекс элемента 20 в подмассиве shorts от 1 до 3: " + indexShorts);

        // String[]
        String[] strings = {"apple", "banana", "cherry"};
        int indexStrings = Arrays.binarySearch(strings, "banana");
        System.out.println("Индекс элемента \"banana\" в массиве strings: " + indexStrings);

        indexStrings = Arrays.binarySearch(strings, 0, 2, "cherry");
        System.out.println("Индекс элемента \"cherry\" в подмассиве strings от 0 до 2: " + indexStrings);

        // Object[] с Comparator
        Person[] people = {new Person("Alice"), new Person("Bob"), new Person("Charlie")};
        Comparator<Person> personComparator = Comparator.comparing(Person::getName);
        int indexPeople = Arrays.binarySearch(people, new Person("Bob"), personComparator);
        System.out.println("Индекс элемента Bob в массиве people: " + indexPeople);

        indexPeople = Arrays.binarySearch(people, 0, 2, new Person("Charlie"), personComparator);
        System.out.println("Индекс элемента Charlie в подмассиве people от 0 до 2: " + indexPeople);

        // Примеры для класса Collections

        // List<Integer>
        List<Integer> integerList = new ArrayList<>(List.of(1, 3, 5, 7));
        int indexIntegerList = Collections.binarySearch(integerList, 5);
        System.out.println("Индекс элемента 5 в списке integerList: " + indexIntegerList);

        // List<String> с Comparator
        List<String> stringList = new ArrayList<>(List.of("apple", "banana", "cherry"));
        Comparator<String> stringComparator = Comparator.naturalOrder();
        int indexStringList = Collections.binarySearch(stringList, "banana", stringComparator);
        System.out.println("Индекс элемента \"banana\" в списке stringList: " + indexStringList);
    }

    private static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
