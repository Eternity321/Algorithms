package recursion;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Число Фибоначчи для " + n + ": " + fibonacci(n));
    }

    // Рекурсивная функция для вычисления числа Фибоначчи
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Если n равно 0 или 1, возвращаем само число
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Вычисляем число Фибоначчи для n как сумму двух предыдущих чисел Фибоначчи
        }
    }
}
