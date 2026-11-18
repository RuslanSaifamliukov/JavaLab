package lr3;
// Задание 8. Символьный массив из 10 элементов: прописные согласные
// буквы английского алфавита, взятые подряд (гласные пропускаются)
public class Task8 {
    public static void main(String[] args) {
        char[] arr = new char[10];

        int i = 0;
        for (char c = 'A'; i < arr.length; c++) {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                continue; // гласные пропускаем
            arr[i] = c;
            i++;
        }

        for (char c : arr)
            System.out.print(c + " ");
        System.out.println();
    }
}
