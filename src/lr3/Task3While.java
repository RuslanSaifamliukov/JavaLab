package lr3;
// Задание 3, версия 2. Числа Фибоначчи (цикл while)
import java.util.Scanner;

public class Task3While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько чисел вывести: ");
        int n = in.nextInt();

        long a = 1, b = 1;
        int i = 1;
        while (i <= n) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
            i++;
        }
        System.out.println();
    }
}
