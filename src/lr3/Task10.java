package lr3;
// Задание 10. Сортировка массива случайных чисел по убыванию
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(101); // числа от 0 до 100
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Сортировка "пузырьком" по убыванию
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }

        System.out.print("Массив после сортировки по убыванию: ");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }
}
