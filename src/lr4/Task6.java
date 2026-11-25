import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int rows = 4, cols = 5;
        Random random = new Random();
        int[][] source = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                source[i][j] = random.nextInt(100);
            }
        }

        int rowToRemove = random.nextInt(rows);
        int colToRemove = random.nextInt(cols);
        System.out.println("Удаляем строку " + rowToRemove + ", столбец " + colToRemove);

        int[][] result = new int[rows - 1][cols - 1];
        int newI = 0;
        for (int i = 0; i < rows; i++) {
            if (i == rowToRemove) continue;
            int newJ = 0;
            for (int j = 0; j < cols; j++) {
                if (j == colToRemove) continue;
                result[newI][newJ] = source[i][j];
                newJ++;
            }
            newI++;
        }

        System.out.println("Исходный массив:");
        printArray(source);
        System.out.println("Результат:");
        printArray(result);
    }

    static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
