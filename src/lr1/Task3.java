package lr1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        String day = in.nextLine();
        System.out.print("Введите месяц: ");
        String month = in.nextLine();
        System.out.print("Введите дату: ");
        int date = in.nextInt();
        System.out.println("Сегодня " + day + ", " + date + " " + month);
        in.close();
    }
}
