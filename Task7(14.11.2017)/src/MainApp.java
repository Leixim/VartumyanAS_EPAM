import factory.FactoryFigure;
import models.Color;
import models.Figure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainApp {

    public static void main(String[] args) {
        Figure[] figures = genereateArraysOfFigures();
        sortFiguresByColor(figures);
    }

    public static Figure[] genereateArraysOfFigures() {
        FactoryFigure factoryFigure = new FactoryFigure();
        Figure[] figures = new Figure[50];
        Random random = new Random(2);
        for (int i = 0; i < figures.length; i++) {
            int t = random.nextInt(2);
            if (t == 1) {
                figures[i] = factoryFigure.getFigure(FactoryFigure.FiguresType.COLOR);
            } else {
                figures[i] = factoryFigure.getFigure(FactoryFigure.FiguresType.NOT_COLOR);
            }
        }
        return figures;
    }

    public static void showAllFigures(List<Figure> arrayFigures) {
        for (int i = 0; i < arrayFigures.size(); i++) {
            System.out.println(arrayFigures.get(i));
        }
    }

    public static void sortFiguresByColor(Figure[] arrayFigures) {
        List<Figure> colorFigure = new ArrayList<>();
        List<Figure> figure = new ArrayList<>();
        int countOfFigures = 0;
        int countOfColorFigures = 0;
        for (int i = 0; i < arrayFigures.length; i++) {
            if (arrayFigures[i] instanceof Color) {
                colorFigure.add(arrayFigures[i]);
                countOfColorFigures++;
            } else {
                figure.add(arrayFigures[i]);
                countOfFigures++;
            }
        }
        System.out.println("Total count of figures: " + countOfFigures);
        System.out.println("Total count of color figures: " + countOfColorFigures);
        System.out.println("***********Figures*********");
        showAllFigures(figure);
        System.out.println("***********Color Figures*********");
        showAllFigures(colorFigure);

    }


}
