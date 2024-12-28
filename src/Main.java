//import java.util.Arrays;
//import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Пример использования метода binarySearch из класса Arrays
        int[] array = {1, 3, 4, 6, 8};
        int index = Arrays.binarySearch(array, 6);
        System.out.println("Индекс элемента 6 в массиве: " + index);

        // Пример использования метода binarySearch из класса Collections
        List<Integer> list = List.of(1, 3, 4, 6, 8);
        index = Collections.binarySearch(list, 6);
        System.out.println("Индекс элемента 6 в списке: " + index);
    }
}