package search.graph.DijkstraSearch;

import java.util.ArrayList;
import java.util.List;

// Класс, представляющий узел графа
public class GraphNode {
    int id; // Идентификатор узла
    List<GraphEdge> edges; // Список ребер, исходящих из данного узла

    // Конструктор для создания узла с заданным идентификатором
    public GraphNode(int id) {
        this.id = id;
        this.edges = new ArrayList<>(); // Создаем новый пустой список ребер
    }

    // Метод для добавления ребра к данному узлу
    public void addEdge(GraphEdge edge) {
        edges.add(edge); // Добавляем ребро в список ребер данного узла
    }
}
