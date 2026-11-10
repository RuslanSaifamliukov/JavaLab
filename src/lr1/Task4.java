package lr1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите месяц: ");
        String month = in.nextLine();
        System.out.print("Введите кол-во дней: ");
        int days = in.nextInt();
        System.out.println("Месяц " + month + " состоит из " + days + " дней");
        in.close();
    }
}
