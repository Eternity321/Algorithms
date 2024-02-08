package search.graph.DijkstraSearch;

import java.util.*;

public class DijkstraSearch {

    public static void main(String[] args) {
        // Пример графа
        GraphNode[] graph = new GraphNode[6];
        for (int i = 0; i < 6; i++) {
            graph[i] = new GraphNode(i);
        }
        graph[0].addEdge(new GraphEdge(1, 7));
        graph[0].addEdge(new GraphEdge(2, 9));
        graph[0].addEdge(new GraphEdge(5, 14));
        graph[1].addEdge(new GraphEdge(2, 10));
        graph[1].addEdge(new GraphEdge(3, 15));
        graph[2].addEdge(new GraphEdge(3, 11));
        graph[2].addEdge(new GraphEdge(5, 2));
        graph[3].addEdge(new GraphEdge(4, 6));
        graph[4].addEdge(new GraphEdge(5, 9));

        dijkstra(graph, 0);
    }

    public static void dijkstra(GraphNode[] graph, int source) {
        int n = graph.length;
        boolean[] visited = new boolean[n]; // Массив для отметки посещенных вершин
        int[] distance = new int[n]; // Массив для хранения кратчайших расстояний от source до всех остальных вершин
        Arrays.fill(distance, Integer.MAX_VALUE); // Инициализируем все расстояния как "бесконечность"
        distance[source] = 0; // Расстояние от source до самого себя равно 0

        PriorityQueue<GraphNode> pq = new PriorityQueue<>(Comparator.comparingInt(node -> distance[node.id]));
        pq.offer(graph[source]); // Добавляем начальную вершину в очередь с приоритетом

        while (!pq.isEmpty()) {
            GraphNode current = pq.poll(); // Извлекаем вершину с наименьшим расстоянием
            int u = current.id;

            if (visited[u]) continue; // Если вершина уже посещена, пропускаем ее
            visited[u] = true; // Отмечаем вершину как посещенную

            for (GraphEdge edge : current.edges) {
                int v = edge.target;
                if (!visited[v] && distance[u] != Integer.MAX_VALUE && distance[u] + edge.weight < distance[v]) {
                    distance[v] = distance[u] + edge.weight; // Обновляем расстояние до вершины v
                    pq.offer(graph[v]); // Добавляем вершину v в очередь с приоритетом
                }
            }
        }

        // Выводим кратчайшие расстояния от source до всех остальных вершин
        for (int i = 0; i < n; i++) {
            System.out.println("Расстояние от вершины " + source + " до вершины " + i + " равно " + distance[i]);
        }
    }
}
