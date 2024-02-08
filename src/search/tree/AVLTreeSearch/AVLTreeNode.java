package search.tree.AVLTreeSearch;

public class AVLTreeNode {
    int val; // Значение узла
    AVLTreeNode left; // Ссылка на левого потомка
    AVLTreeNode right; // Ссылка на правого потомка
    int height; // Высота узла в дереве

    AVLTreeNode(int val) {
        this.val = val; // Инициализируем значение узла
        this.height = 1; // Изначально устанавливаем высоту узла равной 1
    }
}
