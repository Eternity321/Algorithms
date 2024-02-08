package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        // Исходный массив
        int[] array = new int[] {2, 5, 7, 9, 1, 4, 3, 23, 45, 64, 32, 87, 91, 43, 12,16, 54, 15, 32};
        selectionSort(array);
        System.out.println(Arrays.toString(array)); // Вывод отсортированного массива
    }

    //сортировка выбором     Время: O(n^2),  Память: O(1).
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i; // Индекс минимального элемента в оставшейся части массива
            // Находим индекс минимального элемента в оставшейся части массива
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Меняем местами текущий элемент с минимальным элементом
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
