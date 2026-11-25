import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String text = scanner.nextLine();

        System.out.println("Введите ключ");
        int key = scanner.nextInt();
        scanner.nextLine();

        String result = shift(text, key);
        System.out.println("Текст после преобразования: " + result);

        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("y")) {
                result = shift(result, -key);
                System.out.println("Текст после обратного преобразования: " + result);
                break;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
        scanner.close();
    }

    // Сдвиг символа по кодовой таблице с учётом границ алфавита
    static String shift(String text, int key) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c >= 'а' && c <= 'я') {          // русские строчные
                sb.append((char) ('а' + (c - 'а' + key % 32 + 32) % 32));
            } else if (c >= 'А' && c <= 'Я') {   // русские заглавные
                sb.append((char) ('А' + (c - 'А' + key % 32 + 32) % 32));
            } else if (c >= 'a' && c <= 'z') {   // латинские строчные
                sb.append((char) ('a' + (c - 'a' + key % 26 + 26) % 26));
            } else if (c >= 'A' && c <= 'Z') {   // латинские заглавные
                sb.append((char) ('A' + (c - 'A' + key % 26 + 26) % 26));
            } else {                             // остальные символы не меняются
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
