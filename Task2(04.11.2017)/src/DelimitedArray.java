import java.util.Arrays;
import java.util.Random;

/*
В одномерном массиве сначала положительные потом отрицательные за О(n)
*/

public class DelimitedArray {
    public static void main(String[] args) {
        int[] array = generateArray(21);
        System.out.println("Source array" + "\n" + Arrays.toString(array));
        System.out.println("Delimited array" + "\n" + Arrays.toString(delimitedArray(array)));
    }

    public static int[] generateArray(int length) {
        Random randomInt = new Random();
        int[] arrayInt = new int[length];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = randomInt.nextInt(200) - 100;
        }
        return arrayInt;
    }

    public static int[] delimitedArray(int[] arrayInt) {
        int[] array = new int[arrayInt.length];
        for (int i = 0, beginIndex = 0, endIndex = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < 0) {
                array[arrayInt.length - endIndex - 1] = arrayInt[i];
                endIndex++;
            } else {
                array[beginIndex] = arrayInt[i];
                beginIndex++;
            }
        }
        return array;
    }
}
