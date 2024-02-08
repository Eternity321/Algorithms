package search.tree.RedBlackTreeSearch;

// Класс, представляющий узел красно-черного дерева
public class RBTreeNode {
    int val; // Значение узла
    RBTreeNode left; // Левый потомок
    RBTreeNode right; // Правый потомок
    boolean isRed; // Поле для хранения цвета узла

    // Конструктор для создания узла с заданным значением
    public RBTreeNode(int val) {
        this.val = val; // Устанавливаем значение узла
        this.isRed = true; // По умолчанию узел красный
        this.left = null; // Изначально левый потомок отсутствует
        this.right = null; // Изначально правый потомок отсутствует
    }
}
