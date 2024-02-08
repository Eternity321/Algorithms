package search.array;

// Класс для выполнения бинарного поиска в массиве
public class BinarySearch {
    public static void main(String[] args){
        // Исходный массив
        int[] array = new int[] {2, 5, 7, 9, 1, 4, 3, 23, 45, 64, 32, 87, 91, 43, 12, 16, 54, 15, 32};
        // Целевое значение для поиска
        int target = 23;
        // Вызываем метод binarySearch для поиска целевого значения в массиве
        int resultIndex = binarySearch(array, target);
        // Выводим результат
        if (resultIndex != -1) {
            System.out.println("Элемент " + target + " найден в массиве по индексу " + resultIndex);
        } else {
            System.out.println("Элемент " + target + " не найден в массиве.");
        }
    }

    // Метод для выполнения бинарного поиска в отсортированном массиве
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Если элемент в середине равен целевому значению, вернуть его индекс
            if (array[mid] == target) {
                return mid;
            }

            // Если целевое значение меньше элемента в середине, искать слева от середины
            if (array[mid] > target) {
                right = mid - 1;
            }
            // Иначе искать справа от середины
            else {
                left = mid + 1;
            }
        }
        // Если целевое значение не найдено, вернуть -1
        return -1;
    }
}
