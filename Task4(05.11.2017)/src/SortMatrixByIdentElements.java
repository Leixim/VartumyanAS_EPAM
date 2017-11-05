/*
Дана целочисленная прямоугольная матрица.
Упорядочить строки, по возрастанию по самой длинной серии одинаковых элементов.
*/

import java.util.Arrays;
import java.util.Random;

public class SortMatrixByIdentElements {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(4, 5);
        sortMatrixByIdentElements(matrix);
    }

    public static int[][] generateMatrix(int lines, int columns) {
        Random randomInt = new Random();
        int[][] matrixInt = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matrixInt[i][j] = randomInt.nextInt(2);
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

    public static void sortMatrixByIdentElements(int[][] matrix) {
        int[] seqArray = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sequence = 1;
            int maxSeq = 0;
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] == matrix[i][j + 1]) {
                    sequence++;
                    if (maxSeq < sequence) {
                        maxSeq = sequence;
                    }
                } else {
                    sequence = 1;
                }
            }
            seqArray[i] = maxSeq;
        }
        System.out.println("\n" + "Length of sequence of identical elements in lines" + "\n" + Arrays.toString(seqArray));
        for (int i = 0; i < seqArray.length; i++) {
            for (int j = 1; j < (seqArray.length - i); j++) {
                if (seqArray[j - 1] > seqArray[j]) {
                    int temp = seqArray[j - 1];
                    seqArray[j - 1] = seqArray[j];
                    seqArray[j] = temp;
                    for (int k = 0; k < matrix[i].length; k++) {
                        int temp2 = matrix[j - 1][k];
                        matrix[j - 1][k] = matrix[j][k];
                        matrix[j][k] = temp2;
                    }
                }
            }
        }
        System.out.println("\n" + "Sorted matrix");
        matrixToString(matrix);
    }
}
