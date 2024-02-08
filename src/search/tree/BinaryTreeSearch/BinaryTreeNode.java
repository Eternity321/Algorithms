package search.tree.BinaryTreeSearch;

// Класс, представляющий узел двоичного дерева поиска
public class BinaryTreeNode {
    int val; // Значение узла
    BinaryTreeNode left; // Левый потомок
    BinaryTreeNode right; // Правый потомок

    // Конструктор для создания узла с заданным значением
    public BinaryTreeNode(int val) {
        this.val = val; // Устанавливаем значение узла
        this.left = null; // Изначально левый потомок отсутствует
        this.right = null; // Изначально правый потомок отсутствует
    }
}
