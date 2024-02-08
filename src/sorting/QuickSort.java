package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // Исходный массив
        int[] array = new int[] {2, 5, 7, 9, 1, 4, 3, 23, 45, 64, 32, 87, 91, 43, 12, 16, 54, 15, 32};

        // Сортировка
        quickSort(array, 0, array.length - 1);

        // Вывод отсортированного массива
        System.out.println(Arrays.toString(array));
    }

    //быстрая сортировка    Время: O(n^2),  Память: O(log n).

    // Метод для быстрой сортировки
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Разделение массива и получение индекса опорного элемента
            int pi = partition(array, low, high);

            // Рекурсивно сортируем элементы до и после опорного элемента
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Метод для разделения массива
    private static int partition(int[] array, int low, int high) {
        // Опорный элемент (pivot)
        int pivot = array[high];
        int i = (low - 1); // Индекс меньшего элемента

        for (int j = low; j < high; j++) {
            // Если текущий элемент меньше или равен опорному
            if (array[j] <= pivot) {
                i++;

                // Меняем местами array[i] и array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Меняем местами array[i+1] и array[high] (или опорный элемент)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
