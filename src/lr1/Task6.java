package lr1;

import java.util.Scanner;

// посхалка в заданий 7........

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int CURRENT_YEAR = 2026;
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите год рождения: ");
        int birthYear = in.nextInt();
        int age = CURRENT_YEAR - birthYear;
        System.out.println(name + ", ваш возраст " + age);
        in.close();
    }
}
