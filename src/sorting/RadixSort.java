package sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        // Исходный массив
        int[] array = new int[] {2, 5, 7, 9, 1, 4, 3, 23, 45, 64, 32, 87, 91, 43, 12, 16, 54, 15, 32};
        // Максимальное число разрядов в массиве
        int maxDigits = getMaxDigits(array);
        // Сортировка поразрядная сортировка
        radixSort(array, maxDigits);
        // Вывод отсортированного массива
        System.out.println(Arrays.toString(array));
    }

    //поразрядная сортировка     Время: O(k * n),  Память: O(n + k).

    // Метод для получения максимального числа разрядов в массиве
    private static int getMaxDigits(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            int numDigits = (int) Math.log10(num) + 1;
            if (numDigits > max) {
                max = numDigits;
            }
        }
        return max;
    }

    // Метод для поразрядная сортировки
    public static void radixSort(int[] array, int maxDigits) {
        // Создаем 10 корзин (buckets) для каждой цифры (0-9)
        int[][] buckets = new int[10][array.length];
        int[] bucketCounts = new int[10];

        // Поразрядная сортировка для каждой цифры, начиная с младшей и заканчивая старшей
        for (int digit = 1; digit <= maxDigits; digit++) {
            // Распределение элементов массива по корзинам
            for (int num : array) {
                int bucketIndex = (num / (int) Math.pow(10, digit - 1)) % 10;
                buckets[bucketIndex][bucketCounts[bucketIndex]++] = num;
            }

            // Сборка элементов обратно в исходный массив, с учетом порядка из корзин
            int index = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < bucketCounts[i]; j++) {
                    array[index++] = buckets[i][j];
                }
                // Сброс счетчиков корзин для следующей итерации
                bucketCounts[i] = 0;
            }
        }
    }
}
