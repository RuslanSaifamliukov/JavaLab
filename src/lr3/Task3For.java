package lr3;
// Задание 3, версия 1. Числа Фибоначчи (цикл for)
import java.util.Scanner;

public class Task3For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько чисел вывести: ");
        int n = in.nextInt();

        long a = 1, b = 1; // первые два числа последовательности
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
