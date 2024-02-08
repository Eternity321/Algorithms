package search.tree.RedBlackTreeSearch;

// Класс для выполнения поиска в красно-черном дереве
public class RedBlackTreeSearch {
    // Метод для выполнения поиска в красно-черном дереве
    public static boolean search(RBTreeNode root, int target) {
        // Если корень равен null, значит, дерево пусто и элемент не найден
        if (root == null) {
            return false;
        }

        // Проверяем, является ли текущий узел целевым значением
        if (root.val == target) {
            return true;
        }
        // Если текущее значение больше целевого, идем влево
        else if (root.val > target) {
            return search(root.left, target);
        }
        // Если текущее значение меньше целевого, идем вправо
        else {
            return search(root.right, target);
        }
    }
}
