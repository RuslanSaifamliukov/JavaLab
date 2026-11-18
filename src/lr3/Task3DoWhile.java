package lr3;
// Задание 3, версия 3. Числа Фибоначчи (цикл do-while)
import java.util.Scanner;

public class Task3DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько чисел вывести: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Число должно быть положительным");
            return;
        }

        long a = 1, b = 1;
        int i = 1;
        do {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
            i++;
        } while (i <= n);
        System.out.println();
    }
}
