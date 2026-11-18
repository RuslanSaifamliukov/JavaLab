package lr3;
// Задание 9. Минимальный элемент массива: значение и индексы ВСЕХ
// элементов с минимальным значением
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(11); // числа от 0 до 10
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Поиск минимального значения
        int min = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] < min)
                min = arr[i];

        System.out.println("Минимальное значение: " + min);

        // Вывод индексов ВСЕХ элементов с минимальным значением
        System.out.print("Индексы минимальных элементов: ");
        for (int i = 0; i < n; i++)
            if (arr[i] == min)
                System.out.print(i + " ");
        System.out.println();
    }
}
