public class Task4 {
    public static void main(String[] args) {
        int size = 8;
        int[][] triangle = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = 2;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }
}
