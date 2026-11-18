package lr3;
// Задание 6. Массив из чисел, дающих остаток 2 при делении на 5,
// с обработкой ошибки некорректного ввода размера
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            int n = in.nextInt();

            if (n <= 0) {
                System.out.println("Ошибка: размер массива должен быть положительным");
                return;
            }

            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = 5 * i + 2; // 2, 7, 12, 17, ...

            System.out.print("Массив: ");
            for (int x : arr)
                System.out.print(x + " ");
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение");
        }
    }
}
