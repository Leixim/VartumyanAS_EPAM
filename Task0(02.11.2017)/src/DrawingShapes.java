/*
Используя циклы и метод:
System.out.print("* "), System.out.print("  "),
System.out.print("\n")
(для перехода на новую строку).
Выведите на экран:
· прямоугольник
· прямоугольный треугольник
· равносторонний треугольник
· ромб
*/

public class DrawingShapes {
    public static void main(String[] args) {
        drawingRectangle(10, 11);
        System.out.println();
        drawingRTriangle(11);
        System.out.println();
        drawingTriangle(11);
        System.out.println();
        drawingRhombus(11);
    }

    public static void drawingRectangle(int lines, int columns) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || i == lines - 1 || (j == 0) || (j == columns - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void drawingRTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || i == j || i == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void drawingTriangle(int size) {
        for (int i = 0; i <= size / 2; i++) {
            for (int j = 0; j < size; j++) {
                if (j == ((size / 2) - i) || j == ((size / 2) + i) || (i == size / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void drawingRhombus(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (((j == ((size / 2) - i) || j == ((size / 2) + i)) && (i < size / 2)) || (i == ((size / 2) + j) || j == ((size + (size / 2 - 1) - i))) && (i >= size / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

}
