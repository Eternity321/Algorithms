package search.hash;

import java.util.HashMap;

public class HashTableSearch {
    public static void main(String[] args) {
        // Создание и заполнение хеш-таблицы
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(2, 20);
        map.put(5, 50);
        map.put(7, 70);
        map.put(9, 90);
        map.put(1, 10);
        map.put(4, 40);
        map.put(3, 30);
        map.put(23, 230);
        map.put(45, 450);
        map.put(64, 640);
        map.put(32, 320);
        map.put(87, 870);
        map.put(91, 910);
        map.put(43, 430);
        map.put(12, 120);
        map.put(16, 160);
        map.put(54, 540);
        map.put(15, 150);
        map.put(32, 320); // Этот ключ уже присутствует в таблице

        // Целевое значение для поиска
        int target = 23;

        // Вызываем метод search для выполнения поиска в хеш-таблице
        boolean found = search(map, target);

        // Выводим результат
        if (found) {
            System.out.println("Элемент " + target + " найден в хеш-таблице.");
        } else {
            System.out.println("Элемент " + target + " не найден в хеш-таблице.");
        }
    }

    // Метод для выполнения поиска в хеш-таблице
    public static boolean search(HashMap<Integer, Integer> map, int target) {
        return map.containsKey(target);
    }
}
