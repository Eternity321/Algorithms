package recursion;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        long factorial = factorial(n);
        System.out.println("Факториал числа " + n + " равен " + factorial);
    }

    // Рекурсивная функция для вычисления факториала числа n
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Факториал 0 и 1 равен 1
        } else {
            return n * factorial(n - 1); // Рекурсивный вызов для вычисления факториала (n - 1)
        }
    }
}
