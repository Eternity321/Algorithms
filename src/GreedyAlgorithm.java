import java.util.*;

// Класс для реализации жадного алгоритма размена монет
public class GreedyAlgorithm {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 1000}; // Доступные монеты
        int n = coins.length; // Количество различных типов монет

        int amount = 93; // Сумма, которую нужно разменять

        // Выводим результат размена
        System.out.println("Минимальное количество монет, необходимых для размена " + amount + ": " + minCoins(coins, n, amount));
    }

    // Метод для вычисления минимального количества монет, необходимых для размена суммы amount
    public static int minCoins(int[] coins, int n, int amount) {
        // Сортируем монеты в убывающем порядке
        Arrays.sort(coins);
        int result = 0; // Инициализируем результат

        // Проходим по всем монетам, начиная с самой крупной
        for (int i = n - 1; i >= 0; i--) {
            // Вычитаем текущую монету, пока это возможно
            while (amount >= coins[i]) {
                amount -= coins[i];
                result++;
            }
        }

        return result; // Возвращаем общее количество использованных монет
    }
}
