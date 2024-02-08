package search.tree.AVLTreeSearch;

public class AVLTreeSearch {
    public static void main(String[] args) {
        // Создание AVL-дерева
        AVLTreeNode root = new AVLTreeNode(10); // Создаем корень дерева и устанавливаем значение 10
        root.left = new AVLTreeNode(5); // Устанавливаем левого потомка для корня со значением 5
        root.right = new AVLTreeNode(20); // Устанавливаем правого потомка для корня со значением 20
        root.left.left = new AVLTreeNode(3); // Устанавливаем левого потомка для левого потомка корня со значением 3
        root.left.right = new AVLTreeNode(7); // Устанавливаем правого потомка для левого потомка корня со значением 7

        // Целевое значение для поиска
        int target = 7;

        // Вызываем метод search для выполнения поиска в AVL-дереве
        boolean found = search(root, target);

        // Выводим результат
        if (found) {
            System.out.println("Элемент " + target + " найден в AVL-дереве.");
        } else {
            System.out.println("Элемент " + target + " не найден в AVL-дереве.");
        }
    }

    // Метод для выполнения поиска в AVL-дереве
    public static boolean search(AVLTreeNode root, int target) {
        if (root == null) {
            return false;
        }

        if (root.val == target) {
            return true;
        } else if (root.val > target) {
            return search(root.left, target); // Рекурсивный вызов для поиска в левом поддереве
        } else {
            return search(root.right, target); // Рекурсивный вызов для поиска в правом поддереве
        }
    }
}
