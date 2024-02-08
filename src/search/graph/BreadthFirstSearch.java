package search.graph;

import java.util.*;

// Класс для выполнения поиска в ширину в графе
public class BreadthFirstSearch {
    public static void main(String[] args) {
        // Создаем граф в виде списка смежности
        List<List<Integer>> graph = new ArrayList<>();
        graph.add(Arrays.asList(1, 2)); // Вершина 0 связана с вершинами 1 и 2
        graph.add(Arrays.asList(0, 3, 4)); // Вершина 1 связана с вершинами 0, 3 и 4
        graph.add(Arrays.asList(0, 5)); // Вершина 2 связана с вершинами 0 и 5
        graph.add(Arrays.asList(1)); // Вершина 3 связана с вершиной 1
        graph.add(Arrays.asList(1)); // Вершина 4 связана с вершиной 1
        graph.add(Arrays.asList(2)); // Вершина 5 связана с вершиной 2

        // Вызываем метод bfs для выполнения поиска в ширину
        bfs(graph, 0); // Начинаем обход с вершины 0
    }

    // Метод для выполнения поиска в ширину в графе
    public static void bfs(List<List<Integer>> graph, int start) {
        Set<Integer> visited = new HashSet<>(); // Множество для хранения посещенных вершин
        Queue<Integer> queue = new LinkedList<>(); // Очередь для обхода вершин в ширину

        queue.offer(start); // Добавляем стартовую вершину в очередь
        visited.add(start); // Отмечаем стартовую вершину как посещенную

        while (!queue.isEmpty()) { // Пока очередь не пуста
            int node = queue.poll(); // Извлекаем вершину из очереди
            System.out.print(node + " "); // Выводим номер текущей вершины

            for (int neighbor : graph.get(node)) { // Для каждого соседа текущей вершины
                if (!visited.contains(neighbor)) { // Если сосед не был посещен
                    queue.offer(neighbor); // Добавляем соседа в очередь
                    visited.add(neighbor); // Отмечаем соседа как посещенного
                }
            }
        }
    }
}
