
import java.util.Random;
import java.util.Scanner;

public class TranspositionMatrices {
    public static void main(String[] arg) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // Введення розмірів матриці
        System.out.print("Введіть кількість стовпців (N): ");
        int N = scanner.nextInt();
        System.out.print("Введіть кількість рядків (M): ");
        int M = scanner.nextInt();

        // Створення та заповнення початкової матриці M x N
        int[][] matrixMxN = new int[M][N];
        for (int i = 0; i < matrixMxN.length; i++) {
            for (int j = 0; j < matrixMxN[i].length; j++) {
                matrixMxN[i][j] = random.nextInt(100);
            }
        }
        // Створення матриці N x M (транспонована матриця)
         int[][] matrixNxM = new int[N][M];
        // Транспонування матриці
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrixNxM[j][i] = matrixMxN[i][j];
            }
        }
        // Виведення матриці M x N
        System.out.println("Матриця N x M:");
        printMatrix(matrixMxN);

        // Виведення транспонованої матриці N x M
        System.out.println("Транспонована матриця M x N:");
        printMatrix(matrixNxM);
    }
    // Метод для виведення матриці
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
