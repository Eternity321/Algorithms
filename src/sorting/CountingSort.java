package sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        // Исходный массив
        int[] array = new int[] {2, 5, 7, 9, 1, 4, 3, 23, 45, 64, 32, 87, 91, 43, 12, 16, 54, 15, 32};
        // Максимальное значение в массиве
        int max = Arrays.stream(array).max().getAsInt();
        // Сортировка подсчётом
        countingSort(array, max);
        // Вывод отсортированного массива
        System.out.println(Arrays.toString(array));
    }

    //сортировка подсчётом   Время: O(n + k),  Память: O(n + k).
    public static void countingSort(int[] array, int max) {
        // Создаем массив для подсчета частоты встречаемости каждого элемента
        int[] count = new int[max + 1];

        // Подсчитываем частоту встречаемости каждого элемента
        for (int num : array) {
            count[num]++;
        }

        // Восстанавливаем отсортированный массив из частот
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            // Добавляем элемент i столько раз, сколько раз он встречается в массиве
            for (int j = 0; j < count[i]; j++) {
                array[index++] = i;
            }
        }
    }
}
