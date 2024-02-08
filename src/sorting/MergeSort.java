package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        // Исходный массив
        int[] array = new int[] {2, 5, 7, 9, 1, 4, 3, 23, 45, 64, 32, 87, 91, 43, 12,16, 54, 15, 32};
        mergeSort(array, 0, array.length - 1); // Вызов метода сортировки слиянием
        System.out.println(Arrays.toString(array)); // Вывод отсортированного массива
    }

    //сортировка слиянием    Время: O(n log n),  Память: O(n).
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2; // Находим средний индекс
            mergeSort(array, left, middle); // Сортировка левой половины массива
            mergeSort(array, middle + 1, right); // Сортировка правой половины массива
            merge(array, left, middle, right); // Слияние отсортированных половин
        }
    }

    // Метод для слияния двух отсортированных массивов
    private static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1; // Длина левого подмассива
        int n2 = right - middle; // Длина правого подмассива

        int[] leftArray = new int[n1]; // Создание временного массива для левой половины
        int[] rightArray = new int[n2]; // Создание временного массива для правой половины

        // Копирование данных во временные массивы
        for (int i = 0; i < n1; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = array[middle + 1 + j];

        int i = 0, j = 0; // Индексы для левого и правого подмассивов
        int k = left; // Индекс для объединенного массива
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i]; // Записываем значение из левого подмассива
                i++;
            } else {
                array[k] = rightArray[j]; // Записываем значение из правого подмассива
                j++;
            }
            k++;
        }

        // Записываем оставшиеся элементы из левого подмассива, если они есть
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Записываем оставшиеся элементы из правого подмассива, если они есть
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
