package lr3;
// Задание 4, версия 1. Вывод чисел от меньшего к большему (цикл for)
import java.util.Scanner;

public class Task4For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = in.nextInt();

        if (a > b) { // упорядочиваем границы
            int t = a;
            a = b;
            b = t;
        }

        for (int i = a; i <= b; i++)
            System.out.print(i + " ");
        System.out.println();
    }
}
