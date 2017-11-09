
/*
Дана квадратная матрица A порядка M (M — нечетное число). Начи-
ная с элемента A1,1 и перемещаясь по часовой стрелке, вывести все ее эле-
менты по спирали: первая строка, последний столбец, последняя строка в
обратном  порядке,  первый  столбец  в  обратном  порядке,  оставшиеся  эле-
менты второй строки и т. д.; последним выводится центральный элемент
матрицы.
 */

import java.util.Random;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = generateSquareMatrix(9);
        printMatrixBySpiral(matrix);
    }

    public static int[][] generateSquareMatrix(int size) {
        Random randomInt = new Random();
        int[][] matrixInt = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixInt[i][j] = randomInt.nextInt(10);
            }
        }
        System.out.println("Source matrix");
        matrixToString(matrixInt);
        return matrixInt;
    }

    public static void matrixToString(int[][] matrixInt) {
        for (int i = 0; i < matrixInt.length; i++) {
            for (int j = 0; j < matrixInt[i].length; j++) {
                System.out.printf("%3d", matrixInt[i][j]);
            }
            System.out.println();
        }
    }

    public static void printMatrixBySpiral(int[][] matrix) {
        int j, k;
        int p = matrix.length / 2;
        System.out.println("\n" + "Values of matrix cells in a spiral");
        for (k = 1; k <= p; k++) {
            for (j = k - 1; j < matrix.length - k + 1; j++) {
                System.out.printf("%3d", matrix[k - 1][j]);
            }
            for (j = k; j < matrix.length - k + 1; j++) {
                System.out.printf("%3d", matrix[j][matrix.length - k]);
            }
            for (j = matrix.length - k - 1; j >= k - 1; --j) {
                System.out.printf("%3d", matrix[matrix.length - k][j]);
            }
            for (j = matrix.length - k - 1; j >= k; j--) {
                System.out.printf("%3d", matrix[j][k - 1]);
                System.out.printf("%3d", matrix[j][k]);
            }
        }
    }
}
