import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int rows = 3, cols = 5;
        Random random = new Random();
        int[][] source = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                source[i][j] = random.nextInt(100);
            }
        }

        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = source[i][j];
            }
        }

        System.out.println("Исходный массив:");
        printArray(source);
        System.out.println("После замены строк и столбцов:");
        printArray(transposed);
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
