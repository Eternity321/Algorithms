package sorting;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        // Исходный массив
        int[] array = new int[] {2, 5, 7, 9, 1, 4, 3, 23, 45, 64, 32, 87, 91, 43, 12, 16, 54, 15, 32};
        // Сортировка Шелла
        shellSort(array);
        // Вывод отсортированного массива
        System.out.println(Arrays.toString(array));
    }

    //сортировка Шелла     Время: O(n^2),  Память: O(1).

    // Метод для сортировки Шелла
    public static void shellSort(int[] array) {
        int n = array.length;

        // Вычисляем начальный интервал
        int interval = 1;
        while (interval < n / 3) {
            interval = interval * 3 + 1; // Формула для вычисления интервала в сортировке Шелла
        }

        // Начинаем сортировку с заданным интервалом
        while (interval >= 1) {
            // Перебираем массив, начиная с элемента, расположенного на интервале
            for (int i = interval; i < n; i++) {
                // Вставляем array[i] в подмассив array[0..i-interval], array[i+interval] и т.д.
                for (int j = i; j >= interval && array[j] < array[j - interval]; j -= interval) {
                    swap(array, j, j - interval); // Если элементы находятся в неправильном порядке, меняем их местами
                }
            }
            interval /= 3; // Уменьшаем интервал
        }
    }

    // Метод для обмена элементов массива
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
