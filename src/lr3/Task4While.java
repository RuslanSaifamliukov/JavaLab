package lr3;
// Задание 4, версия 2. Вывод чисел от меньшего к большему (цикл while)
import java.util.Scanner;

public class Task4While {
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
        while (i <= b) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}
