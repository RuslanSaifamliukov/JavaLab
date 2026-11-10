package lr1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int CURRENT_YEAR = 2026;
        System.out.print("Введите ваш год рождения: ");
        int birthYear = in.nextInt();
        int age = CURRENT_YEAR - birthYear;
        System.out.println("Ваш возраст " + age);
        in.close();
    }
}
