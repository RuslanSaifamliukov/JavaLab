package lr3;
// Задание 5, версия 1. Сумма чисел с остатком 2 при делении на 5
// или остатком 1 при делении на 3 (цикл for)
import java.util.Scanner;

public class Task5For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько чисел суммировать: ");
        int count = in.nextInt();

        int sum = 0;
        int found = 0;
        System.out.print("Суммируемые числа: ");
        for (int i = 0; found < count; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                sum += i;
                found++;
            }
        }
        System.out.println();
        System.out.println("Сумма: " + sum);
    }
}
