package timus.timus_2001;

import java.util.Scanner;

/*
 * Timus 2001. Математики и ягоды
 * http://acm.timus.ru/problem.aspx?space=1&num=2001
 *
 * Логика решения:
 * Первый взвес: a1 b1  - у первого и второго ягоды ещё свои.
 * Второй взвес: a2 b2  - второй пересыпал ягоды первому,
 *                        поэтому b2 = масса пустой корзины второго.
 * Третий взвес: a3 b3  - первый пересыпал всё второму,
 *                        поэтому a3 = масса пустой корзины первого.
 * Отсюда масса ягод первого математика: a1 - a3,
 * масса ягод второго:                   b1 - b2.
 */
public class timus_2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        // ягоды первого = первый взвес минус его пустая корзина
        int firstBerries = a1 - a3;
        // ягоды второго = первый взвес минус его пустая корзина
        int secondBerries = b1 - b2;

        System.out.println(firstBerries + " " + secondBerries);
    }
}
