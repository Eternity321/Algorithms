package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        // Исходный массив
        int[] array = new int[] {2, 5, 7, 9, 1, 4, 3, 23, 45, 64, 32, 87, 91, 43, 12,16, 54, 15, 32};
        bubbleSort(array);
        System.out.println(Arrays.toString(array)); // Вывод отсортированного массива
    }

    //сортировка пузырьком   Время: O(n^2),  Память: O(1).
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // Сравниваем текущий элемент с следующим, если текущий больше следующего, меняем их местами
                if (array[j] > array[j+1]) {
                    int temp = array[j]; // Временная переменная для обмена значений
                    array[j] = array[j+1]; // Перемещаем элемент array[j] вправо
                    array[j+1] = temp; // Перемещаем элемент array[j+1] влево
                }
            }
        }
    }
}
