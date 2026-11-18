package lr3;
// Задание 2, версия 1. Название дня недели -> номер (вложенные if-else)
import java.util.Scanner;

public class Task2IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String day = in.nextLine().trim().toLowerCase();

        int num;
        if (day.equals("понедельник"))      num = 1;
        else if (day.equals("вторник"))     num = 2;
        else if (day.equals("среда"))       num = 3;
        else if (day.equals("четверг"))     num = 4;
        else if (day.equals("пятница"))     num = 5;
        else if (day.equals("суббота"))     num = 6;
        else if (day.equals("воскресенье")) num = 7;
        else num = 0;

        if (num == 0)
            System.out.println("Такого дня нет");
        else
            System.out.println("Порядковый номер: " + num);
    }
}
