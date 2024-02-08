package search.tree.BinaryTreeSearch;

public class BinarySearchTreeSearch {

    public static void main(String[] args) {
        // Отсортированный массив для построения дерева
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Построение двоичного дерева поиска из отсортированного массива
        BinaryTreeNode root = BinarySearchTreeSearch.buildBST(sortedArray, 0, sortedArray.length - 1);

        // Целевое значение для поиска
        int target = 7;

        // Выполнение поиска в двоичном дереве поиска
        boolean found = BinarySearchTreeSearch.search(root, target);

        // Вывод результата поиска
        if (found) {
            System.out.println("Элемент " + target + " найден в двоичном дереве поиска.");
        } else {
            System.out.println("Элемент " + target + " не найден в двоичном дереве поиска.");
        }
    }

    // Метод для выполнения поиска в двоичном дереве поиска
    public static boolean search(BinaryTreeNode root, int target) {
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

    // Метод для построения двоичного дерева поиска из отсортированного массива
    public static BinaryTreeNode buildBST(int[] array, int start, int end) {
        // Если начальный индекс превышает конечный, возвращаем null
        if (start > end) {
            return null;
        }

        // Находим середину массива
        int mid = start + (end - start) / 2;
        // Создаем узел с значением из середины массива
        BinaryTreeNode node = new BinaryTreeNode(array[mid]);
        // Рекурсивно строим левое поддерево из элементов до середины
        node.left = buildBST(array, start, mid - 1);
        // Рекурсивно строим правое поддерево из элементов после середины
        node.right = buildBST(array, mid + 1, end);
        return node;
    }
}
