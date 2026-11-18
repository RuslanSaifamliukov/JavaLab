package lr3;
// Задание 7. Символьный массив из 10 элементов, заполненный буквами
// "через одну" начиная с 'a' (a, c, e, g, ...), вывод в прямом и обратном порядке
public class Task7 {
    public static void main(String[] args) {
        final int SIZE = 10; // размер задается переменной
        char[] arr = new char[SIZE];

        for (int i = 0; i < SIZE; i++)
            arr[i] = (char) ('a' + 2 * i);

        System.out.print("Прямой порядок:   ");
        for (char c : arr)
            System.out.print(c + " ");
        System.out.println();

        System.out.print("Обратный порядок: ");
        for (int i = SIZE - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
