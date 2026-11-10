package lr1;

import java.util.Scanner;

// Если честно, задание 6, ввести Так-же год рождения он пересчитает в год)))
// и тут так-же наоборот работает. Если вводить год, покажет возраст.

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int CURRENT_YEAR = 2026;
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        int birthYear = CURRENT_YEAR - age;
        System.out.println("Ваш год рождения " + birthYear);
        in.close();
    }
}
