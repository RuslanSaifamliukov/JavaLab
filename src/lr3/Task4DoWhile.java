package lr3;
// Задание 4, версия 3. Вывод чисел от меньшего к большему (цикл do-while)
import java.util.Scanner;

public class Task4DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = in.nextInt();

        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        int i = a;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= b);
        System.out.println();
    }
}
