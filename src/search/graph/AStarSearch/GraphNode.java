package search.graph.AStarSearch;

import java.util.ArrayList;
import java.util.List;

// Класс для представления вершины в графе
public class GraphNode {
    int x; // Координата x
    int y; // Координата y
    List<GraphNode> neighbors; // Список соседних вершин
    int g; // Длина пути от стартовой вершины до текущей
    int f; // Оценочная длина пути от стартовой вершины через текущую до конечной вершины
    GraphNode parent; // Родительская вершина в оптимальном пути

    // Конструктор для создания вершины с заданными координатами
    public GraphNode(int x, int y) {
        this.x = x;
        this.y = y;
        this.neighbors = new ArrayList<>(); // Инициализируем список соседних вершин
        this.g = Integer.MAX_VALUE; // Начальное значение g устанавливаем на бесконечность
        this.f = Integer.MAX_VALUE; // Начальное значение f устанавливаем на бесконечность
        this.parent = null; // Родительская вершина пока неизвестна
    }

    // Метод для добавления соседней вершины
    public void addNeighbor(GraphNode neighbor) {
        this.neighbors.add(neighbor);
    }
}
