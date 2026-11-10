package lr1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int prev = n - 1;
        int next = n + 1;
        int sum = prev + n + next;
        int fourth = sum * sum;
        System.out.println("Результат: " + prev + ", " + n + ", " + next + ", " + fourth);
        in.close();
    }
}
