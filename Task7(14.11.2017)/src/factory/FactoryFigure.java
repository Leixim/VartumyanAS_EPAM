package factory;

import models.*;

import java.util.Random;

public class FactoryFigure extends AbstractFigureFactory {
    @Override
    public Figure getFigure(FiguresType figureType) {
        Random random = new Random();
        int generateValue = random.nextInt(4);
        int color = 0;
        switch (figureType) {
            case NOT_COLOR:
                color = 0;
                break;
            case COLOR:
                color = 1;
                break;
            default:
                color = 0;
        }

        Point[] points = new Point[generateValue+1];
        for (int i = 0; i <= generateValue; i++) {
            int x = random.nextInt(500) - 255;
            int y = random.nextInt(500) - 255;
            points[i] = new Point(x, y);
        }

        int figureColor = random.nextInt(255);
        switch (generateValue) {
            case 0: {
                Point a = points[0];
                if (color == 0)
                    return new Point(a.getX(), a.getY());
                else
                    return new ColorPoint(a.getX(), a.getY(), figureColor);
            }
            case 1: {
                Point a = points[0];
                Point b = points[1];
                if (color == 0)
                    return new Line(a, b);
                else
                    return new ColorLine(a, b, figureColor);
            }
            case 2: {
                Point a = points[0];
                Point b = points[1];
                Point c = points[2];
                if (color == 0)
                    return new Triangle(a, b, c);
                else
                    return new ColorTriangle(a, b, c, figureColor);
            }
            case 3: {
                if (color == 0)
                    return new Polygon(points);
                else
                    return new ColorPolygon(points, figureColor);
            }
            default:
                return null;
        }
    }

}
