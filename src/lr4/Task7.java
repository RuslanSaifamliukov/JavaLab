public class Task7 {
    public static void main(String[] args) {
        int n = 5, m = 5; // размеры массива
        int[][] array = new int[n][m];

        int top = 0, bottom = n - 1, left = 0, right = m - 1, value = 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {      // первая строка: слева направо
                array[top][j] = value++;
            }
            for (int i = top + 1; i <= bottom; i++) {  // последний столбец: сверху вниз
                array[i][right] = value++;
            }
            if (top < bottom && left < right) {
                for (int j = right - 1; j >= left; j--) {  // нижняя строка: справа налево
                    array[bottom][j] = value++;
                }
                for (int i = bottom - 1; i > top; i--) {   // первый столбец: снизу вверх
                    array[i][left] = value++;
                }
            }
            top++;
            bottom--;
            left++;
            right--;
        }

        for (int[] row : array) {
            for (int v : row) {
                System.out.printf("%4d", v);
            }
            System.out.println();
        }
    }
}
