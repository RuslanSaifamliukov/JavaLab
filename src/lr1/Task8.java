package lr1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое числло: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        in.close();
    }
}
