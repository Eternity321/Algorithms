package search.heap;

import java.util.*;

public class HeapSearch {
    public static void main(String[] args) {
        // Исходная куча
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.addAll(Arrays.asList(2, 5, 7, 9, 1, 4, 3, 23, 45, 64, 32, 87, 91, 43, 12, 16, 54, 15, 32));

        // Целевое значение для поиска
        int target = 23;

        // Вызываем метод search для выполнения поиска в куче
        boolean found = search(heap, target);

        // Выводим результат
        if (found) {
            System.out.println("Элемент " + target + " найден в куче.");
        } else {
            System.out.println("Элемент " + target + " не найден в куче.");
        }
    }

    // Метод для выполнения поиска в куче
    public static boolean search(PriorityQueue<Integer> heap, int target) {
        return heap.contains(target);
    }
}
