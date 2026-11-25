import java.util.Scanner;

public class Task10 {
    // Собственный алфавит: буквы, пробел, цифры
    private static final String ALPHABET =
            "абвгдеёжзийклмнопрстуфхцчшщъыьэюя 0123456789";

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

    static String shift(String text, int key) {
        StringBuilder sb = new StringBuilder();
        int length = ALPHABET.length();
        for (char c : text.toCharArray()) {
            char lower = Character.toLowerCase(c);
            int index = ALPHABET.indexOf(lower);
            if (index == -1) {
                sb.append(c); // символ не из алфавита — не трогаем
            } else {
                int newIndex = (index + key % length + length) % length;
                char newChar = ALPHABET.charAt(newIndex);
                // сохраняем регистр исходного символа
                sb.append(Character.isUpperCase(c)
                        ? Character.toUpperCase(newChar) : newChar);
            }
        }
        return sb.toString();
    }
}
