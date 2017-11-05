import java.util.Arrays;
import java.util.Random;

/*
Упорядочить одномерный массив(вначале отрицательные по возрастанию, затем положительные по убыванию)
*/

public class SortingArray {

    public static void main(String[] args) {
        int[] array = generateArray(20);
        System.out.println("Source array" + "\n" + Arrays.toString(array));
        System.out.println("Sorted array" + "\n" + Arrays.toString(sortArray(array)));
    }

    public static int[] generateArray(int length) {
        Random randomInt = new Random();
        int[] arrayInt = new int[length];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = randomInt.nextInt(200) - 100;
        }
        return arrayInt;
    }

    public static int[] sortArray(int[] arrayInt) {
        Arrays.sort(arrayInt);
        int borderValue = 0;
        for (int i = 1; i < arrayInt.length; i++) {
            if (arrayInt[i] >= 0 && arrayInt[i - 1] < 0) {
                borderValue = i;
            }
        }

        for (int i = borderValue; i < arrayInt.length; i++) {
            for (int j = arrayInt.length - 1; j > borderValue; j--) {
                if (arrayInt[j] > arrayInt[j - 1]) {
                    int temp = arrayInt[j - 1];
                    arrayInt[j - 1] = arrayInt[j];
                    arrayInt[j] = temp;
                }
            }
        }
        return arrayInt;
    }
}
