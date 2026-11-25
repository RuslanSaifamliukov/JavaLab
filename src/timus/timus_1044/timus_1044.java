package timus.timus_1044;
// Timus 1044 "Счастливые билеты" (Lucky Tickets. Easy!)
// ВАЖНО: на Timus класс должен называться Main —
// переименуйте класс и файл в Main.java перед отправкой.
//
// Идея решения: обе половины номера независимы, поэтому ответ равен
// сумме dp[s]^2 по всем суммам s, где dp[s] — количество комбинаций
// из N/2 цифр с суммой s. dp считается динамическим программированием:
// добавляя по одной цифре 0..9, пересчитываем количество способов
// получить каждую сумму.

import java.util.Scanner;

public class timus_1044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int half = n / 2;
        int maxSum = 9 * half;

        long[] dp = new long[maxSum + 1];
        dp[0] = 1;
        for (int digit = 0; digit < half; digit++) {
            long[] next = new long[maxSum + 1];
            for (int s = 0; s <= maxSum; s++) {
                if (dp[s] == 0) continue;
                for (int d = 0; d <= 9; d++) {
                    next[s + d] += dp[s];
                }
            }
            dp = next;
        }

        long answer = 0;
        for (int s = 0; s <= maxSum; s++) {
            answer += dp[s] * dp[s];
        }
        System.out.println(answer);
    }
}
