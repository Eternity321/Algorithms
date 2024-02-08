package search.array;

// Класс для выполнения линейного поиска в массиве
public class LinearSearch {

    // Метод main, в котором демонстрируется использование линейного поиска
    public static void main(String[] args){
        // Исходный массив
        int[] array = new int[] {2, 5, 7, 9, 1, 4, 3, 23, 45, 64, 32, 87, 91, 43, 12, 16, 54, 15, 32};
        // Целевое значение для поиска
        int target = 23;
        // Вызываем метод linearSearch для поиска целевого значения в массиве
        int resultIndex = linearSearch(array, target);
        // Выводим результат
        if (resultIndex != -1) {
            System.out.println("Элемент " + target + " найден в массиве по индексу " + resultIndex);
        } else {
            System.out.println("Элемент " + target + " не найден в массиве.");
        }
    }

    // Метод для выполнения линейного поиска в массиве
    public static int linearSearch(int[] array, int target) {
        // Перебор всех элементов массива
        for (int i = 0; i < array.length; i++) {
            // Если текущий элемент равен целевому значению, вернуть его индекс
            if (array[i] == target) {
                return i;
            }
        }
        // Если целевое значение не найдено, вернуть -1
        return -1;
    }
}
