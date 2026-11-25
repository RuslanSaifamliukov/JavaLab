public class Task3 {
    public static void main(String[] args) {
        int rows = 7, cols = 15;
        int[][] rect = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    rect[i][j] = 2;
                } else {
                    rect[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(rect[i][j]);
            }
            System.out.println();
        }
    }
}
