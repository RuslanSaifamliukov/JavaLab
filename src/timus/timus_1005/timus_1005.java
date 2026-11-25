package timus.timus_1005;
// Timus 1005 "Куча камней" (Stone Pile)
// ВАЖНО: на Timus класс должен называться Main —
// переименуйте класс и файл в Main.java перед отправкой.
//
// Идея решения: перебор битовых масок. Каждая маска из 2^n вариантов
// задаёт деление камней на две кучи. Для каждой маски считаем разность
// |total - 2 * sum|, где sum — вес первой кучи. Минимальная разность — ответ.

import java.util.Scanner;

public class timus_1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] weights = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
            total += weights[i];
        }

        int best = Integer.MAX_VALUE;
        // маска 0 означает "все камни во второй куче", 2^n - 1 — "все в первой"
        for (int mask = 0; mask < (1 << n); mask++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += weights[i];
                }
            }
            int diff = Math.abs(total - 2 * sum);
            if (diff < best) {
                best = diff;
            }
        }
        System.out.println(best);
    }
}
