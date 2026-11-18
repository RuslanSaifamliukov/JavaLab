package lr3;// Листинг 1. Пример решения задачи № 9 БЕЗ поиска повторяющихся
// минимальных элементов массива
import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[10];

        // Заполнение массива случайными числами от -10 до 10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(21) - 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Поиск первого (и единственного выводимого) минимального элемента
        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Его индекс: " + minIndex);
    }
}
