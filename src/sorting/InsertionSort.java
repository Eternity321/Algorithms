package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        // Исходный массив
        int[] array = new int[] {2, 5, 7, 9, 1, 4, 3, 23, 45, 64, 32, 87, 91, 43, 12,16, 54, 15, 32};
        insertionSort(array);
        System.out.println(Arrays.toString(array)); // Вывод отсортированного массива
    }

    //сортировка вставками   Время: O(n^2),  Память: O(1).
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i]; // Значение текущего элемента, который нужно вставить в правильное место
            int j = i - 1; // Индекс предыдущего элемента
            // Перемещение элементов больших, чем key, вправо
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]; // Перемещаем элемент вправо
                j = j - 1; // Уменьшаем индекс для сравнения с предыдущим элементом
            }
            array[j + 1] = key; // Вставляем key в правильное место
        }
    }
}
