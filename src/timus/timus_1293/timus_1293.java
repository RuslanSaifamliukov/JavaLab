package timus.timus_1293;

import java.util.Scanner;

public class timus_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("N: ");
        int n = in.nextInt();
        System.out.print("A: ");
        int a = in.nextInt();
        System.out.print("B: ");
        int b = in.nextInt();

        System.out.println("Требуется нанограммов сульфида: " + (n * a * b * 2));
        in.close();
    }
}