package search.graph.DijkstraSearch;

// Класс, представляющий ребро графа
public class GraphEdge {
    int target; // Целевая вершина ребра
    int weight; // Вес ребра

    // Конструктор для создания ребра с заданными целевой вершиной и весом
    public GraphEdge(int target, int weight) {
        this.target = target;
        this.weight = weight;
    }
}
