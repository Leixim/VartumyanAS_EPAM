
/*
Дана целочисленная прямоугольная матрица.
Упорядочить столбцы по убыванию среднего значения.
*/

import java.util.Arrays;
import java.util.Random;

public class SortMatrixByAvgColumns {

    public static void main(String[] args) {
        int[][] matrix = generateMatrix(5, 8);
        sortMatrixByAvgColumns(matrix);
    }

    public static int[][] generateMatrix(int lines, int columns) {
        Random randomInt = new Random();
        int[][] matrixInt = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matrixInt[i][j] = randomInt.nextInt(100);
            }
        }
        System.out.println("Source matrix");
        matrixToString(matrixInt);
        return matrixInt;
    }

    public static void matrixToString(int[][] matrixInt) {
        for (int i = 0; i < matrixInt.length; i++) {
            for (int j = 0; j < matrixInt[i].length; j++) {
                System.out.printf("%6d", matrixInt[i][j]);
            }
            System.out.println();
        }
    }

    public static void sortMatrixByAvgColumns(int[][] matrix) {
        float[] avgArrayColumn = new float[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            float avgSumColumns = 0.0f;
            for (int j = 0; j < matrix.length; j++) {
                avgSumColumns = avgSumColumns + matrix[j][i];
            }
            avgArrayColumn[i] = avgSumColumns / matrix.length;
        }
        System.out.println("\n" + "Average values of matrix columns" + "\n" + Arrays.toString(avgArrayColumn));
        for (int i = 0; i < avgArrayColumn.length; i++) {
            for (int j = 1; j < (avgArrayColumn.length - i); j++) {
                if (avgArrayColumn[j - 1] < avgArrayColumn[j]) {
                    float temp = avgArrayColumn[j - 1];
                    avgArrayColumn[j - 1] = avgArrayColumn[j];
                    avgArrayColumn[j] = temp;
                    for (int k = 0; k < matrix.length; k++) {
                        int temp2 = matrix[k][j];
                        matrix[k][j] = matrix[k][j - 1];
                        matrix[k][j - 1] = temp2;
                    }
                }
            }
        }
        System.out.println("\n" + "Sorted matrix");
        matrixToString(matrix);
    }
}
