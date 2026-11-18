package lr3;
// Задание 2, версия 2. Название дня недели -> номер (оператор switch)
import java.util.Scanner;

public class Task2Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String day = in.nextLine().trim().toLowerCase();

        int num;
        switch (day) {
            case "понедельник":  num = 1; break;
            case "вторник":      num = 2; break;
            case "среда":        num = 3; break;
            case "четверг":      num = 4; break;
            case "пятница":      num = 5; break;
            case "суббота":      num = 6; break;
            case "воскресенье":  num = 7; break;
            default:             num = 0;
        }

        if (num == 0)
            System.out.println("Такого дня нет");
        else
            System.out.println("Порядковый номер: " + num);
    }
}
