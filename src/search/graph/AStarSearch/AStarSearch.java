package search.graph.AStarSearch;

import java.util.*;

// Класс для выполнения поиска с использованием алгоритма A*
public class AStarSearch {
    public static void main(String[] args) {
        // Создаем граф
        GraphNode start = new GraphNode(0, 0); // Начальная вершина
        GraphNode end = new GraphNode(3, 4); // Целевая вершина
        List<GraphNode> graph = new ArrayList<>(); // Создаем список вершин графа
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 4; j++) {
                graph.add(new GraphNode(i, j)); // Добавляем вершины в граф
            }
        }
        // Создаем связи между соседними вершинами
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                graph.get(i * 5 + j).addNeighbor(graph.get((i + 1) * 5 + j));
                graph.get((i + 1) * 5 + j).addNeighbor(graph.get(i * 5 + j));
                graph.get(i * 5 + j).addNeighbor(graph.get(i * 5 + j + 1));
                graph.get(i * 5 + j + 1).addNeighbor(graph.get(i * 5 + j));
            }
        }

        // Выполняем поиск с использованием алгоритма A*
        boolean found = aStarSearch(start, end);

        // Выводим результат
        if (found) {
            System.out.println("Путь найден.");
        } else {
            System.out.println("Путь не найден.");
        }
    }

    // Метод для выполнения поиска с использованием алгоритма A*
    public static boolean aStarSearch(GraphNode start, GraphNode end) {
        PriorityQueue<GraphNode> queue = new PriorityQueue<>((a, b) -> a.f - b.f);
        Set<GraphNode> visited = new HashSet<>();

        start.g = 0; // Начальное значение стоимости пути от начальной вершины
        start.f = start.g + heuristic(start, end); // Вычисляем эвристическую оценку
        queue.offer(start); // Добавляем начальную вершину в очередь

        while (!queue.isEmpty()) {
            GraphNode current = queue.poll(); // Извлекаем вершину с наименьшей оценкой
            visited.add(current); // Помечаем вершину как посещенную

            if (current == end) { // Если достигли целевой вершины, возвращаем успех
                return true;
            }

            // Рассматриваем соседей текущей вершины
            for (GraphNode neighbor : current.neighbors) {
                if (!visited.contains(neighbor)) { // Если сосед еще не посещен
                    int tentative_g = current.g + 1; // Вычисляем стоимость пути до соседа
                    if (tentative_g < neighbor.g) { // Если новый путь лучше предыдущего
                        neighbor.parent = current; // Обновляем родителя соседа
                        neighbor.g = tentative_g; // Обновляем стоимость пути до соседа
                        neighbor.f = neighbor.g + heuristic(neighbor, end); // Обновляем общую оценку пути через соседа
                        if (!queue.contains(neighbor)) {
                            queue.offer(neighbor); // Добавляем соседа в очередь
                        }
                    }
                }
            }
        }

        return false; // Путь не найден
    }

    // Эвристическая функция для алгоритма A*
    private static int heuristic(GraphNode node, GraphNode end) {
        // Возвращаем эвристическое значение (например, Евклидово расстояние)
        return Math.abs(node.x - end.x) + Math.abs(node.y - end.y);
    }
}
