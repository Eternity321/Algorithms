package search.graph;

import java.util.*;

// Класс для выполнения поиска в глубину в графе
public class DepthFirstSearch {
    public static void main(String[] args) {
        // Создаем граф в виде списка смежности
        List<List<Integer>> graph = new ArrayList<>();
        graph.add(Arrays.asList(1, 2)); // Вершина 0 связана с вершинами 1 и 2
        graph.add(Arrays.asList(0, 3, 4)); // Вершина 1 связана с вершинами 0, 3 и 4
        graph.add(Arrays.asList(0, 5)); // Вершина 2 связана с вершинами 0 и 5
        graph.add(Arrays.asList(1)); // Вершина 3 связана с вершиной 1
        graph.add(Arrays.asList(1)); // Вершина 4 связана с вершиной 1
        graph.add(Arrays.asList(2)); // Вершина 5 связана с вершиной 2

        // Вызываем метод dfs для выполнения поиска в глубину
        dfs(graph, 0); // Начинаем обход с вершины 0
    }

    // Метод для выполнения поиска в глубину в графе
    public static void dfs(List<List<Integer>> graph, int start) {
        Set<Integer> visited = new HashSet<>(); // Множество для хранения посещенных вершин
        Stack<Integer> stack = new Stack<>(); // Стек для обхода вершин в глубину

        stack.push(start); // Добавляем стартовую вершину в стек

        while (!stack.isEmpty()) { // Пока стек не пуст
            int node = stack.pop(); // Извлекаем вершину из стека

            if (!visited.contains(node)) { // Если вершина не была посещена
                visited.add(node); // Отмечаем вершину как посещенную
                System.out.print(node + " "); // Выводим номер текущей вершины

                for (int neighbor : graph.get(node)) { // Для каждого соседа текущей вершины
                    if (!visited.contains(neighbor)) { // Если сосед не был посещен
                        stack.push(neighbor); // Добавляем соседа в стек
                    }
                }
            }
        }
    }
}
